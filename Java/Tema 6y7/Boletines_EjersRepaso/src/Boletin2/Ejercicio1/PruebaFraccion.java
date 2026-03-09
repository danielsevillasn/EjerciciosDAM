package Boletin2.Ejercicio1;

public class PruebaFraccion {
    public static void main(String[] args) {
        // 1. Creamos dos fracciones
        Fraccion f1 = new Fraccion(4, 8);
        Fraccion f2 = new Fraccion(3, 5);

        System.out.println("--- Estado Inicial ---");
        System.out.println("F1: " + f1); // Debería mostrar 4/8
        System.out.println("F2: " + f2); // Debería mostrar 3/5

        // 2. Probamos el método simplifica
        System.out.println("\n--- Probando Simplifica ---");
        f1.simplifica();
        System.out.println("F1 simplificada (4/8 -> 1/2): " + f1);

        // 3. Probamos el método invierte
        System.out.println("\n--- Probando Invierte ---");
        f2.invierte();
        System.out.println("F2 invertida (3/5 -> 5/3): " + f2);

        // 4. Probamos la multiplicación
        // Recordamos que f1 es 1/2 y f2 ahora es 5/3
        System.out.println("\n--- Probando Multiplica ---");
        System.out.println("Operación: " + f1 + " * " + f2);
        f1.multiplica(f2); 
        System.out.println("Nuevo valor de F1: " + f1); // (1*5) / (2*3) = 5/6

        // 5. Probamos la división
        // f1 es 5/6 y f2 es 5/3
        System.out.println("\n--- Probando Divide ---");
        System.out.println("Operación: " + f1 + " / " + f2);
        f1.dividir(f2);
        System.out.println("Nuevo valor de F1: " + f1); // (5*3) / (6*5) = 15/30
        
        // Simplificamos el resultado final
        f1.simplifica();
        System.out.println("F1 final simplificada: " + f1); // 1/2
    }
}
