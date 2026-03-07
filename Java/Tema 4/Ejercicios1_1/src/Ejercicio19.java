import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] array = new int[12];

        // 1. Generar números aleatorios
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 201);
        }

        // 2. Mostrar array original
        System.out.print("Índice: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        System.out.print("Valor:  ");
        for (int n : array) {
            System.out.print(n + "\t");
        }

        System.out.println("\n");

        // 3. Pedir datos al usuario
        System.out.print("Introduzca el número que quiere insertar: ");
        int numero = s.nextInt();

        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int posicion = s.nextInt();

        // 4. Desplazamiento a la derecha
        for (int i = array.length - 1; i > posicion; i--) {
            array[i] = array[i - 1];
        }

        // 5. Insertar el número
        array[posicion] = numero;

        // 6. Mostrar array resultante
        System.out.println("\nArray resultante:");

        System.out.print("Índice: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        System.out.print("Valor:  ");
        for (int n : array) {
            System.out.print(n + "\t");
        }
        s.close();
    }
}