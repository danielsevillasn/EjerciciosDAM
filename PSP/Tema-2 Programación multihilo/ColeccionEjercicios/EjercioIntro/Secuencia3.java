//El hilo dos en ningún caso es iniciado hasta haber finalizado el hilo uno. 
public class Secuencia3 {
    public static void main(String[] args) throws InterruptedException {
        EjemploThread hilo1 = new EjemploThread();
        Thread hilo2 = new Thread(new EjemploRun());

        // 1. Iniciar Hilo Uno
        hilo1.start();

        Thread.sleep(1500);

        // Interrumpir y esperar la finalización completa de Hilo Uno
        hilo1.interrupt();
        hilo1.join();

        System.out.println("--- Hilo Uno ha finalizado. Ahora se iniciará Hilo Dos ---");

        // 2. Iniciar Hilo Dos SOLO tras la muerte de Hilo Uno
        hilo2.start();

        // Esperar a que Hilo Dos concluya sus descansos e interrumpirlo si fuera
        // necesario
        hilo2.join();

        System.out.println("Programa principal finalizado secuencialmente.");
    }
}
