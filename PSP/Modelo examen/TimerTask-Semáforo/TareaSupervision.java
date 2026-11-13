import java.util.TimerTask;
import java.util.concurrent.Semaphore;

/**
 * Tarea periódica de supervisión del sistema gestionada por un Timer.
 * 
 * Se ejecuta a intervalos regulares (cada segundo) mostrando en tiempo real
 * la actividad de los hilos de lectura (consultando al Monitor) y los permisos
 * libres en el semáforo.
 */
public class TareaSupervision extends TimerTask {

    private final Semaphore semaforo;
    private final MonitorCalidadAire monitor;

    public TareaSupervision(Semaphore semaforo, MonitorCalidadAire monitor) {
        this.semaforo = semaforo;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        // Consulta los hilos activos directamente desde el monitor de forma sincronizada
        int activos = monitor.getHilosActivos();
        int permisos = semaforo.availablePermits();
        System.out.println("[TIMER - Monitorización] Hilos de lectura activos: " + activos + " | Permisos libres: " + permisos);
    }
}