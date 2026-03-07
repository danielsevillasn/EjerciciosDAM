import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String palabra = s.nextLine();

        int[] ascii = new int[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            ascii[i] = palabra.charAt(i);
            System.out.print(ascii[i] + " ");
        }

        String reconstruido = "";
        for (int i = 0; i < ascii.length; i++) {
            reconstruido = reconstruido + (char) ascii[i];
        }

        System.out.println("\nReconstruido: " + reconstruido);
        s.close();
    }
}