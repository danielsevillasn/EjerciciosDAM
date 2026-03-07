public class Ejercicio1_1 {
    public static void main(String[] args) throws InterruptedException{
        String AMARILLO = "\u001B[33m";
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";

        // Mostrar UNO en grande
        System.out.println(AMARILLO);
        Thread.sleep(1000);
        System.out.println(" ██    ██ ███    ██  ██████  ");
        Thread.sleep(1000);
        System.out.println(" ██    ██ ████   ██ ██    ██ ");
        Thread.sleep(1000);
        System.out.println(" ██    ██ ██ ██  ██ ██    ██ ");
        Thread.sleep(1000);
        System.out.println(" ██    ██ ██  ██ ██ ██    ██ ");
        Thread.sleep(1000);
        System.out.println("  ██████  ██   ████  ██████  ");
        Thread.sleep(1000);
        System.out.print(RESET);
        System.out.println(ROJO);
        Thread.sleep(2000);
        System.out.println("Dale enter para comenzar...");
        System.out.println(RESET);

        // Esperar 2 segundos
        Thread.sleep(2000);
    }
}

