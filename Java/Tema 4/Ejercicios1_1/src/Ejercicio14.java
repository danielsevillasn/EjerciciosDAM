import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista de colores reconocidos
        String[] colores = {
            "verde", "rojo", "azul", "amarillo", "naranja",
            "rosa", "negro", "blanco", "morado"
        };

        String[] palabras = new String[8];
        String[] resultado = new String[8];

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce 8 palabras:");
            palabras[i] = sc.nextLine().toLowerCase();
        }

        int indice = 0;

        // PRIMERO: añadir colores
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            boolean esColor = false;

            // comprobamos si es un color (sin método)
            for (int j = 0; j < colores.length; j++) {
                if (palabra.equalsIgnoreCase(colores[j])) {
                    esColor = true;
                    break;
                }
            }

            if (esColor) {
                resultado[indice++] = palabra;
            }
        }

        // SEGUNDO: añadir palabras que NO son colores
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            boolean esColor = false;

            for (int j = 0; j < colores.length; j++) {
                if (palabra.equalsIgnoreCase(colores[j])) {
                    esColor = true;
                    break;
                }
            }

            if (!esColor) {
                resultado[indice++] = palabra;
            }
        }

        // Mostrar array original
        System.out.println("\nArray original:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("[" + i + "] " + palabras[i]);
        }

        // Mostrar array resultado
        System.out.println("\nArray resultado:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("[" + i + "] " + resultado[i]);
        }

        sc.close();
    }
}