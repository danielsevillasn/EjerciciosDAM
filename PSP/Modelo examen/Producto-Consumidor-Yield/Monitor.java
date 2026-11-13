/**
 * Monitor que representa el almacén o silo de tránsito intermedio.
 * Implementa el patrón Productor-Consumidor sincronizado con Semáforos
 * (Semaphore)
 * y exclusión mutua mediante métodos/bloques synchronized sobre un array
 * circular estático.
 */
public class Monitor {

    public static final String[] NOMBRES_TIPOS = {
            "Destino 1 (Local - Madrid Urbana)",
            "Destino 2 (Provincial - Comunidad Madrid)",
            "Destino 3 (Peninsular - Nacional)",
            "Destino 4 (Islas - Baleares y Canarias)",
            "Destino 5 (Internacional - UE)"
    };

    private static final int CAPACIDAD = 3;

    // Búfer circular estático (sin LinkedList ni colecciones dinámicas)
    private final int[] bufer = new int[CAPACIDAD];
    private int in = 0; // Puntero de inserción para productores
    private int out = 0; // Puntero de extracción para consumidores
    private int elementosEnBufer = 0; // Cantidad actual de elementos en el silo

    // Variables estadísticas consolidadas (sincronizadas vía synchronized, sin
    // AtomicInteger)
    private final int totalFurgonetasEsperadas;
    private int totalFurgonetasProcesadas = 0;
    private int totalPaquetesConAveria = 0;
    private int totalPaquetesProcesados = 0;
    private final int[] conteoPorDestino = new int[5];

    public Monitor(int totalProgramados) {
        this.totalFurgonetasEsperadas = totalProgramados;
    }

    public synchronized void depositar(int tipoContenedor) throws InterruptedException {
        while (elementosEnBufer == CAPACIDAD) {
            System.out.println("[PRODUCTOR] Almacen LLENO (0 huecos). Furgoneta bloqueada en wait()...");
            wait();
        }


        // 2. Exclusión mutua garantizada por monitor synchronized sobre el array
        // circular
        bufer[in] = tipoContenedor;
        in = (in + 1) % CAPACIDAD;
        elementosEnBufer++;

        int paquetesActuales = elementosEnBufer;

        // 3. Notifica a los consumidores que hay un nuevo elemento disponible
        notifyAll();

        if (tipoContenedor != 0) {
            System.out.println(
                    "[PRODUCTOR] Paquete 'Tipo " + tipoContenedor + "' depositado en cinta. Ocupación: " + paquetesActuales);
        }
    }

    public synchronized int retirar(int numeroConsumidor) throws InterruptedException {
        // 1. Espera a que exista al menos un contenedor disponible
        while (elementosEnBufer == 0) {
            wait();
        }

        // 2. Extracción del búfer circular
        int tipoContenedor = bufer[out];
        bufer[out] = 0;
        out = (out + 1) % CAPACIDAD;
        elementosEnBufer--;

        int paquetesActuales = elementosEnBufer;

        // 3. Notificar a los hilos en espera (productores)
        notifyAll();

        if (tipoContenedor != 0) {
            System.out.println(
                    "[CONSUMIDOR "+numeroConsumidor+"] Paquete 'Tipo " + tipoContenedor + "' retirado en cinta. Ocupación: " + paquetesActuales);
        }

        return tipoContenedor;
    }

    /**
     * Envía la señal de terminación a los trenes consumidores (Poison Pill).
     */
    public void finalizarProduccion(int numeroConsumidores) throws InterruptedException {
        for (int i = 0; i < numeroConsumidores; i++) {
            depositar(0);
        }
    }

    // --- Métodos de sincronización estadística (exclusión mutua sin AtomicInteger)
    // ---

    public synchronized void registrarIncidencia(String idBuque) {
        totalPaquetesConAveria++;
    }

    public synchronized void registrarFurgonetaConDescarga(String idBuque) {
        totalFurgonetasProcesadas++;
    }

    public synchronized void registrarEvacuacion(int tipo) {
        if (tipo >= 1 && tipo <= 5) {
            conteoPorDestino[tipo - 1]++;
            totalPaquetesProcesados++;
        }
    }

    public synchronized void mostrarBalance() {
        System.out.println("\n============================================================");
        System.out.println(" BALANCE DE DISTRIBUCIÓN Y EMBALAJE");
        System.out.println("============================================================");
        System.out.printf("Furgonetas esperadas     : %d%n", totalFurgonetasEsperadas);
        System.out.printf("Furgonetas procesadas    : %d%n", totalFurgonetasProcesadas);
        System.out.printf("Furgonetas con avería  : %d%n", totalPaquetesConAveria);
        System.out.println("\nDesglose de paquetes embalados:");
        for (int i = 0; i < NOMBRES_TIPOS.length; i++) {
            System.out.printf(" - %-36s : %d paquetes%n", NOMBRES_TIPOS[i], conteoPorDestino[i]);
        }
        System.out.printf("%nTotal de paquetes procesados con éxito: %d%n", totalPaquetesProcesados);
        System.out.println("============================================================\n");
    }
}
