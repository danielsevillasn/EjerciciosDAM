import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.Semaphore;

/**
 * Aplicación Central: Servidor de Monitorización de Calidad del Aire.
 * 
 * Orquesta:
 * 1. El lanzamiento y captura de procesos hijo (EstacionSensora) vía ProcessBuilder.
 * 2. La supervisión periódica en tiempo real con Timer y TimerTask.
 * 3. La lectura concurrente multihilo acotada por un Semaphore (máximo 3 permisos).
 * 4. La agregación de resultados protegida en un Monitor con sincronización pura (sin AtomicInteger).
 */
public class ServidorMonitorizacion {

    private static final int ESTACIONES_POR_DEFECTO = 5;
    private static final int MAX_PERMISOS_SEMAFORO = 3;

    public static void main(String[] args) {
        // 1. Obtención y validación del número de estaciones sensoras
        int numEstaciones = obtenerNumeroEstaciones();

        System.out.println("\n** Desplegando " + numEstaciones + " estaciones sensoras... **");

        // 2. Despliegue de los procesos hijo y recolección de sus identificadores
        List<String> idsEstaciones = new ArrayList<>();
        List<Process> listaProcesos = new ArrayList<>();

        desplegarEstaciones(numEstaciones, listaProcesos, idsEstaciones);

        // 3. Espera obligatoria a la finalización de todos los procesos hijo
        esperarProcesos(listaProcesos);
        System.out.println("\n** Todas las estaciones han finalizado sus tareas. **");

        // Pausa de 1 segundo de margen antes de procesar los ficheros
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("** Iniciando procesamiento con Semáforo (Max " + MAX_PERMISOS_SEMAFORO + " hilos simultáneos) y Timer... **\n");

        // 4. Configuración del monitor y control de concurrencia
        MonitorCalidadAire monitor = new MonitorCalidadAire(idsEstaciones.size());
        Semaphore semaforo = new Semaphore(MAX_PERMISOS_SEMAFORO, true);

        // 5. Activación del temporizador de supervisión periódica (Timer y TimerTask)
        Timer timer = new Timer();
        TareaSupervision tareaSupervision = new TareaSupervision(semaforo, monitor);
        // Delay inicial de 1000 ms y repetición cada 1000 ms
        timer.schedule(tareaSupervision, 500, 500);

        // 6. Lanzamiento de hilos lectores (un hilo por cada estación registrada)
        List<Thread> hilosLectores = new ArrayList<>();
        for (String id : idsEstaciones) {
            Thread hilo = new Thread(new HiloLector(id, monitor, semaforo), "Lector-" + id);
            hilosLectores.add(hilo);
            hilo.start();
        }

        // 7. Espera a la finalización de todos los hilos lectores mediante join()
        for (Thread hilo : hilosLectores) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.err.println("El hilo principal fue interrumpido durante la espera.");
                Thread.currentThread().interrupt();
            }
        }

        // 8. Detención obligatoria del Timer para permitir que la JVM finalice limpiamente
        timer.cancel();
        System.out.println("\n** Procesamiento finalizado. Cancelando temporizador. **");

        // 9. Muestra consolidada de los resultados finales
        monitor.mostrarInforme();
    }

    /**
     * Recupera el número de estaciones por argumento de consola o teclado,
     * aplicando el valor por defecto si la entrada es inválida.
     */
    private static int obtenerNumeroEstaciones() {
        int n = ESTACIONES_POR_DEFECTO;
        Scanner s = new Scanner(System.in);
        System.out.print("Indica el número de estaciones sensoras a desplegar: ");
        String entrada = s.nextLine();
        try {
            n = Integer.parseInt(entrada.trim());
            if (n <= 0) {
                System.out.println("El valor debe ser mayor que 0. Se usarán " + ESTACIONES_POR_DEFECTO + " estaciones por defecto.");
                n = ESTACIONES_POR_DEFECTO;
            }
        } catch (NumberFormatException e) {
            System.out.println("Dato introducido inválido. Se consideran " + ESTACIONES_POR_DEFECTO + " estaciones por defecto.");
            n = ESTACIONES_POR_DEFECTO;
        }
        s.close();
        return n;
    }

    /**
     * Lanza los procesos hijo mediante ProcessBuilder de forma compatible con Windows y Linux.
     */
    private static void desplegarEstaciones(int numEstaciones, List<Process> listaProcesos, List<String> idsEstaciones) {
        // Determinación del Classpath de forma dinámica y portátil
        String classpath = System.getProperty("java.class.path");
        if (classpath == null || classpath.isEmpty()) {
            classpath = ".";
        }
        File binDir = new File("bin");
        if (binDir.exists() && binDir.isDirectory()) {
            classpath = classpath + File.pathSeparator + binDir.getAbsolutePath();
        }

        for (int i = 0; i < numEstaciones; i++) {
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "EstacionSensora");
            // Se fija el directorio de trabajo del proceso
            pb.directory(new File("."));

            try {
                Process proceso = pb.start();
                listaProcesos.add(proceso);

                // Lectura inmediata del identificador emitido por la estación por su salida estándar
                try (BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                    String lineaId = br.readLine();
                    if (lineaId != null && !lineaId.trim().isEmpty()) {
                        String idLimpio = lineaId.trim();
                        idsEstaciones.add(idLimpio);
                        System.out.println(" -> Estación conectada: " + idLimpio);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al lanzar el proceso hijo número " + (i + 1) + ": " + e.getMessage());
            }
        }
    }

    /**
     * Espera a que concluya la ejecución de todos los procesos lanzados.
     */
    private static void esperarProcesos(List<Process> listaProcesos) {
        for (Process p : listaProcesos) {
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                System.err.println("Interrupción durante la espera del proceso: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}