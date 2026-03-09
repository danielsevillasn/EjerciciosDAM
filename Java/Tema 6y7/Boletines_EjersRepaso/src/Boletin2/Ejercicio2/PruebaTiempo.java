package Boletin2.Ejercicio2;

public class PruebaTiempo {
    public static void main(String[] args) {
        // Caso del enunciado: 30m 40s
        Tiempo t1 = new Tiempo(0, 30, 40);
        // Caso del enunciado: 35m 20s
        Tiempo t2 = new Tiempo(0, 35, 20);

        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);

        // Probando la suma
        System.out.println("\n--- Sumando T2 a T1 ---");
        t1.suma(t2); 
        System.out.println("Resultado (debe ser 1h 6m 0s): " + t1);

        // Probando la resta
        System.out.println("\n--- Restando 40 minutos a T1 ---");
        Tiempo t3 = new Tiempo(0, 40, 0);
        t1.resta(t3);
        System.out.println("Resultado final: " + t1); // 0h 26m 0s
    }
}
