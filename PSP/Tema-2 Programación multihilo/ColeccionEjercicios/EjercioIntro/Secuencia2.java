//El programa padre nunca termina antes que el hilo dos, podría hacerlo antes que el hilo uno. 
public class Secuencia2 {
    public static void main(String[] args) throws InterruptedException {
        EjemploThread hilo1 = new EjemploThread();
        Thread hilo2 = new Thread(new EjemploRun());

        hilo1.start();
        hilo2.start();

        // Dejamos ejecutar 3 segundos para dar tiempo al flujo de HiloDos
        Thread.sleep(3000);

        // El padre interrumpe a hilo2
        hilo2.interrupt();

        // El padre espera exclusivamente a que finalice el hilo 2
        hilo2.join();

        System.out.println("Padre finalizado (Hilo Dos garantizado terminado).");
    }
}
