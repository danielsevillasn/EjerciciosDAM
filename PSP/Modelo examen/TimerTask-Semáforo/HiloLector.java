import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore;

/**
 * Hilo de lectura concurrente de ficheros de estación sensora.
 * 
 * Regula su acceso concurrente al sistema de archivos mediante un Semaphore
 * (máximo 3 permisos simultáneos) y actualiza el monitor de resultados
 * con exclusión mutua.
 */
public class HiloLector implements Runnable {

    private final String idEstacion;
    private final MonitorCalidadAire monitor;
    private final Semaphore semaforo;

    public HiloLector(String idEstacion, MonitorCalidadAire monitor, Semaphore semaforo) {
        this.idEstacion = idEstacion;
        this.monitor = monitor;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            // Solicita 1 de los 3 permisos permitidos en el semáforo
            semaforo.acquire();

            // Notifica al monitor que ha comenzado su fase de lectura
            monitor.incrementarHilosActivos();

            // Simulación de un pequeño tiempo de lectura y procesado (600 - 1200 ms)
            Thread.sleep((int) (Math.random() * 601) + 600);

            // Búsqueda del fichero generado por la estación sensora
            File fichero = new File(idEstacion + ".txt");
            if (!fichero.exists()) {
                fichero = new File("bin", idEstacion + ".txt");
            }

            if (fichero.exists() && fichero.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea = br.readLine();
                    if (linea != null && !linea.trim().isEmpty()) {
                        int valorPM25 = Integer.parseInt(linea.trim());
                        monitor.registrarMuestra(valorPM25);
                    } else {
                        monitor.registrarSinRespuesta();
                    }
                } catch (IOException | NumberFormatException e) {
                    monitor.registrarSinRespuesta();
                }
            } else {
                // Si la estación falló o no existe el archivo
                monitor.registrarSinRespuesta();
            }

        } catch (InterruptedException e) {
            System.err.println("Hilo lector " + idEstacion + " interrumpido.");
            Thread.currentThread().interrupt();
        } finally {
            // Decrementa el contador de hilos activos en el monitor
            monitor.decrementarHilosActivos();

            // LIBERACIÓN OBLIGATORIA DEL PERMISO EN EL SEMÁFORO
            semaforo.release();
        }
    }
}