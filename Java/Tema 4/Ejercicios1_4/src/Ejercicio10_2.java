import java.util.Scanner;

public class Ejercicio10_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String nombre = s.nextLine().trim();

        String[] partes = nombre.split("\\s+");
        String iniciales = "";

        for (int i = 0; i < partes.length; i++) {
            iniciales = iniciales + partes[i].toUpperCase().charAt(0);
        }

        System.out.println("Iniciales: " + iniciales);
        s.close();
    }
}