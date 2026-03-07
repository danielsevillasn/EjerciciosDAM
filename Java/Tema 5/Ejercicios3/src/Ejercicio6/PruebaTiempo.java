package Ejercicio6;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(2, 40, 30);
        Tiempo t2 = new Tiempo(1, 21, 60);
        System.out.println(t1);
        System.out.println(t2);
        t1.suma(t2);
        t2.suma(2, 120, 360);
        System.out.println(t1);
        System.out.println(t2);
    }
}
