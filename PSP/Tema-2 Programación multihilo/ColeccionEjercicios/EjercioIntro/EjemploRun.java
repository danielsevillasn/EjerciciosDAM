import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class EjemploRun implements Runnable {
    @Override
    public void run() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        Random random = new Random();

        System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo run activado.");

        try {
            // Descansa 2 segundos obligatorios
            Thread.sleep(2000);
            System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo run ha descansado 2 segundos.");

            // Descansa un tiempo adicional aleatorio entre 0 y 2000 ms (máximo 2s más)
            int tiempoAdicional = random.nextInt(2001);
            Thread.sleep(tiempoAdicional);
            System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo run ha terminado tras descansar "
                    + tiempoAdicional + " ms adicionales.");

        } catch (InterruptedException e) {
            System.out.println("[" + LocalTime.now().format(fmt) + "] Hilo run interrumpido durante el descanso.");
            return;
        }

        // Bucle while(true) que finaliza con interrupción (si continúa tras los
        // descansos)
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
