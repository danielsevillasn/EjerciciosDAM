import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploThread extends Thread {
    @Override
    public void run() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo thread iniciado.");

        // Bucle infinito que finaliza mediante interrupción
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // Simulación de trabajo puntual
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Se restaura/detecta la bandera de interrupción al capturar la excepción
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo thread finalizado por interrupción.");
    }
}
