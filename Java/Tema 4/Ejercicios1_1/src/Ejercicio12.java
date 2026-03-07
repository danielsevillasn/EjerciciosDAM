import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        // Pedir 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            array[i] = sc.nextInt();
        }

        // Mostrar array inicial
        System.out.println("\nArray inicial:");
        System.out.print("Índice: ");
        for (int i = 0; i < 10; i++) System.out.print(i + " ");
        System.out.println();

        System.out.print("Valor:  ");
        for (int i = 0; i < 10; i++) System.out.print(array[i] + " ");
        System.out.println();

        // Pedir posiciones inicial y final
        int inicial, fin;
        do {
            System.out.print("\nPosición inicial (0-9): ");
            inicial = sc.nextInt();

            System.out.print("Posición final (0-9): ");
            fin = sc.nextInt();

            if (inicial < 0 || inicial > 9 || fin < 0 || fin > 9 || inicial >= fin) {
                System.out.println("Error: posiciones inválidas. Deben estar entre 0-9 y inicial < final.");
            }
        } while (inicial < 0 || inicial > 9 || fin < 0 || fin > 9 || inicial >= fin);

        // Guardamos el valor a mover
        int valor = array[inicial];

        // Rotamos hacia la izquierda desde inicial hasta final - 1
        for (int i = inicial; i < fin; i++) {
            array[i] = array[i + 1];
        }

        // Colocamos el valor en la posición final
        array[fin] = valor;

        // Mostrar array final
        System.out.println("\nArray final:");
        System.out.print("Índice: ");
        for (int i = 0; i < 10; i++) System.out.print(i + " ");
        System.out.println();

        System.out.print("Valor:  ");
        for (int i = 0; i < 10; i++) System.out.print(array[i] + " ");
        System.out.println();
        sc.close();
    }
}