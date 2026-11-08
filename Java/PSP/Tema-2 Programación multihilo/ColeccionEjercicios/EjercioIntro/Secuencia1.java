//El programa padre nunca termina antes que el hilo uno, podría hacerlo antes que el hilo dos.
public class Secuencia1 {
    
    public static void main(String[] args) throws InterruptedException {
        EjemploThread hilo1 = new EjemploThread();
        Thread hilo2 = new Thread(new EjemploRun());

        hilo1.start();
        hilo2.start();

        // Dejamos ejecutar 1 segundo
        Thread.sleep(1000);

        // El padre interrumpe a hilo1 para que pueda terminar
        hilo1.interrupt();
        
        // El padre espera exclusivamente a que finalice el hilo 1
        hilo1.join(); 

        // En este punto, hilo1 ha terminado, pero hilo2 puede continuar o terminar después
        System.out.println("Padre finalizado (Hilo Uno garantizado terminado).");
    }
}
