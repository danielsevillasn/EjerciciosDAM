import java.util.concurrent.Semaphore;

/**
 * Monitor que representa el almacén o silo de tránsito intermedio.
 * Implementa el patrón Productor-Consumidor sincronizado con Semáforos (Semaphore)
 * y exclusión mutua mediante métodos/bloques synchronized sobre un array circular estático.
 */
public class AlmacenDeTransitoIntermedio {

    public static final String[] NOMBRES_TIPOS = {
        "Tipo 1 (Carga Seca Estándar)",
        "Tipo 2 (Alimentación Refrigerada)",
        "Tipo 3 (Productos Farmacéuticos)",
        "Tipo 4 (Material Frágil y Electrónica)",
        "Tipo 5 (Granel / Cisterna Líquidos)",
        "Tipo 6 (Mercancía Peligrosa IMO)"
    };

    private static final int CAPACIDAD = 4;

    // Búfer circular estático (sin LinkedList ni colecciones dinámicas)
    private final String[] bufer = new String[CAPACIDAD];
    private int in = 0;               // Puntero de inserción para productores
    private int out = 0;              // Puntero de extracción para consumidores
    private int elementosEnBufer = 0; // Cantidad actual de elementos en el silo

    // Semáforos contadores para control de flujo
    private final Semaphore semHuecos = new Semaphore(CAPACIDAD, true);
    private final Semaphore semElementos = new Semaphore(0, true);

    // Variables estadísticas consolidadas (sincronizadas vía synchronized, sin AtomicInteger)
    private final int totalProgramados;
    private int totalConDescarga = 0;
    private int totalConIncidencia = 0;
    private int totalContenedoresEvacuados = 0;
    private final int[] conteoPorTipo = new int[6];

    public AlmacenDeTransitoIntermedio(int totalProgramados) {
        this.totalProgramados = totalProgramados;
    }

    /**
     * Mapea el código numérico al identificador con formato del examen.
     */
    public static String obtenerEtiquetaContenedor(int tipo) {
        switch (tipo) {
            case 1: return "CONT-Seca-1";
            case 2: return "CONT-Reefer-2";
            case 3: return "CONT-Farma-3";
            case 4: return "CONT-Frágil-4";
            case 5: return "CONT-Granel-5";
            case 6: return "CONT-IMO-6";
            default: return "CONT-Gen-" + tipo;
        }
    }

    /**
     * Extrae el código numérico de tipo desde la etiqueta del contenedor.
     */
    public static int extraerTipoDesdeEtiqueta(String etiqueta) {
        try {
            int ultimoGuion = etiqueta.lastIndexOf('-');
            if (ultimoGuion != -1 && ultimoGuion < etiqueta.length() - 1) {
                return Integer.parseInt(etiqueta.substring(ultimoGuion + 1));
            }
        } catch (NumberFormatException ignored) {
        }
        return 1;
    }

    /**
     * Operación de Depósito (Productor / Grúa):
     * 1. semHuecos.acquire()
     * 2. Inserción en el array circular bajo exclusión mutua con synchronized (sin semáforo binario)
     * 3. semElementos.release()
     */
    public void depositar(String contenedor) throws InterruptedException {
        if (semHuecos.availablePermits() == 0 && !"FIN".equals(contenedor)) {
            System.out.println("[GRÚA PÓRTICO] Silo LLENO (0 huecos). Grúa bloqueada en semHuecos.acquire()...");
        }

        // 1. Espera a que exista al menos un hueco libre
        semHuecos.acquire();

        int huecosLibres;
        int elementos;

        // 2. Exclusión mutua garantizada por monitor synchronized sobre el array circular
        synchronized (this) {
            bufer[in] = contenedor;
            in = (in + 1) % CAPACIDAD;
            elementosEnBufer++;

            huecosLibres = semHuecos.availablePermits();
            elementos = elementosEnBufer;
        }

        // 3. Notifica a los consumidores que hay un nuevo elemento disponible
        semElementos.release();

        if (!"FIN".equals(contenedor)) {
            System.out.println("[GRÚA PÓRTICO] Contenedor '" + contenedor + "' depositado. Huecos libres: " 
                    + huecosLibres + " | Elementos: " + elementos);
        }
    }

    /**
     * Operación de Retirada (Consumidor / Tren de carga):
     * 1. semElementos.acquire()
     * 2. Extracción del array circular bajo exclusión mutua con synchronized (sin semáforo binario)
     * 3. semHuecos.release()
     */
    public String retirar(String nombreTren) throws InterruptedException {
        // 1. Espera a que exista al menos un contenedor disponible
        semElementos.acquire();

        String contenedor;
        int huecosAntes;
        int elementosRestantes;

        // 2. Exclusión mutua garantizada por monitor synchronized sobre el array circular
        synchronized (this) {
            contenedor = bufer[out];
            bufer[out] = null;
            out = (out + 1) % CAPACIDAD;
            elementosEnBufer--;

            elementosRestantes = elementosEnBufer;
            huecosAntes = semHuecos.availablePermits();
        }

        // 3. Notifica a los productores que se ha liberado un hueco
        semHuecos.release();
        int huecosDespues = semHuecos.availablePermits();

        if (!"FIN".equals(contenedor)) {
            if (huecosAntes == 0) {
                System.out.println("[" + nombreTren + "] Contenedor '" + contenedor 
                        + "' cargado en convoy. semHuecos.release() emitido -> Huecos libres: " + huecosDespues);
                System.out.println("[GRÚA PÓRTICO] Grúa desbloqueada tras liberación de hueco.");
            } else {
                System.out.println("[" + nombreTren + "] Contenedor '" + contenedor 
                        + "' cargado en convoy. Huecos libres: " + huecosDespues + " | Elementos: " + elementosRestantes);
            }
        }

        return contenedor;
    }

    /**
     * Envía la señal de terminación a los trenes consumidores (Poison Pill).
     */
    public void finalizarProduccion(int numeroConsumidores) throws InterruptedException {
        for (int i = 0; i < numeroConsumidores; i++) {
            depositar("FIN");
        }
    }

    // --- Métodos de sincronización estadística (exclusión mutua sin AtomicInteger) ---

    public synchronized void registrarIncidencia(String idBuque) {
        totalConIncidencia++;
    }

    public synchronized void registrarBuqueConDescarga(String idBuque) {
        totalConDescarga++;
    }

    public synchronized void registrarEvacuacion(int tipo) {
        if (tipo >= 1 && tipo <= 6) {
            conteoPorTipo[tipo - 1]++;
            totalContenedoresEvacuados++;
        }
    }

    public synchronized void mostrarBalance() {
        System.out.println("\n============================================================");
        System.out.println(" BALANCE OPERATIVO DE LA TERMINAL PORTUARIA");
        System.out.println("============================================================");
        System.out.printf("Buques programados     : %d%n", totalProgramados);
        System.out.printf("Buques con descarga    : %d%n", totalConDescarga);
        System.out.printf("Buques con incidencia  : %d%n", totalConIncidencia);
        System.out.println("\nDesglose de contenedores transportados:");
        for (int i = 0; i < NOMBRES_TIPOS.length; i++) {
            System.out.printf(" - %-36s : %d contenedores%n", NOMBRES_TIPOS[i], conteoPorTipo[i]);
        }
        System.out.printf("%nTotal de contenedores evacuados con éxito: %d%n", totalContenedoresEvacuados);
        System.out.println("============================================================\n");
    }
}
