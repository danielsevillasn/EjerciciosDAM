/**
 * Monitor para la sincronización y recolección de estadísticas de calidad del aire.
 * 
 * Gestiona el acceso con exclusión mutua (synchronized) a las variables compartidas
 * donde todos los hilos lectores acumulan los datos de las estaciones sensoras
 * y el estado de concurrencia del sistema (sin necesidad de AtomicInteger).
 */
public class MonitorCalidadAire {

    // Nombres y descriptores de los niveles según el baremo de PM2.5
    public static final String[] NIVELES = {
        "Nivel 1 (Buena)",
        "Nivel 2 (Moderada)",
        "Nivel 3 (No saludable para grupos sensibles)",
        "Nivel 4 (Perjudicial)"
    };

    private int totalRegistradas = 0;
    private int totalConRespuesta = 0;
    private int totalSinRespuesta = 0;

    // Control de hilos lectores en ejecución activa dentro de su sección de lectura
    private int hilosActivos = 0;

    // Contadores para cada uno de los 4 niveles (índices 0 a 3)
    private final int[] conteoPorNivel = new int[4];
    private double sumaTotalPM25 = 0.0;

    public MonitorCalidadAire(int totalRegistradas) {
        this.totalRegistradas = totalRegistradas;
    }

    /**
     * Incrementa el número de hilos lectores activos con exclusión mutua.
     */
    public synchronized void incrementarHilosActivos() {
        hilosActivos++;
    }

    /**
     * Decrementa el número de hilos lectores activos con exclusión mutua.
     */
    public synchronized void decrementarHilosActivos() {
        hilosActivos--;
    }

    /**
     * Devuelve el número actual de hilos lectores activos.
     */
    public synchronized int getHilosActivos() {
        return hilosActivos;
    }

    /**
     * Registra una muestra válida leída de un fichero con exclusión mutua.
     * 
     * @param pm25 Valor de partículas PM2.5 (entre 1 y 100)
     */
    public synchronized void registrarMuestra(int pm25) {
        totalConRespuesta++;
        sumaTotalPM25 += pm25;

        if (pm25 >= 1 && pm25 <= 12) {
            conteoPorNivel[0]++; // Nivel 1
        } else if (pm25 >= 13 && pm25 <= 35) {
            conteoPorNivel[1]++; // Nivel 2
        } else if (pm25 >= 36 && pm25 <= 55) {
            conteoPorNivel[2]++; // Nivel 3
        } else {
            conteoPorNivel[3]++; // Nivel 4 (56-100)
        }
    }

    /**
     * Registra una estación que no ha emitido fichero o cuya lectura ha fallado.
     */
    public synchronized void registrarSinRespuesta() {
        totalSinRespuesta++;
    }

    public synchronized int getTotalRegistradas() {
        return totalRegistradas;
    }

    public synchronized int getTotalConRespuesta() {
        return totalConRespuesta;
    }

    public synchronized int getTotalSinRespuesta() {
        return totalSinRespuesta;
    }

    public synchronized double getMediaPM25() {
        if (totalConRespuesta == 0) {
            return 0.0;
        }
        return sumaTotalPM25 / totalConRespuesta;
    }

    public synchronized int[] getConteoPorNivel() {
        return conteoPorNivel.clone();
    }

    /**
     * Imprime por pantalla el informe consolidado final.
     */
    public synchronized void mostrarInforme() {
        System.out.println("\n============================================================");
        System.out.println("           INFORME DE CALIDAD DEL AIRE");
        System.out.println("============================================================");
        System.out.println("Estaciones registradas : " + totalRegistradas);
        System.out.println("Estaciones con respuesta: " + totalConRespuesta);
        System.out.println("Estaciones sin respuesta: " + totalSinRespuesta);
        System.out.println("\nDesglose de niveles:");
        for (int i = 0; i < NIVELES.length; i++) {
            System.out.printf("  - %-46s: %d%n", NIVELES[i], conteoPorNivel[i]);
        }
        System.out.println();
        System.out.printf("Concentración media de PM2.5: %.2f µg/m³%n", getMediaPM25());
        System.out.println("============================================================\n");
    }
}