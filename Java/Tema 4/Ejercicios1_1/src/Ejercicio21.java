import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        int[] array5 = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*501);
        }

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Cincocerización sin fórmulas y sin funciones extras
        for (int i = 0; i < array.length; i++) {

            // Si ya es múltiplo de 5, se mantiene igual
            if (array[i] % 5 == 0) {
                array5[i] = array[i];
            } else {
                // Buscar el siguiente múltiplo de 5 mediante incremento
                int numero = array[i];
                while (numero % 5 != 0) {
                    numero++;            // avanzar hasta que sea múltiplo de 5
                }
                array5[i] = numero;
            }
        }

        System.out.println("\n\nArray cincuerizado:");
        for (int num : array5) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}