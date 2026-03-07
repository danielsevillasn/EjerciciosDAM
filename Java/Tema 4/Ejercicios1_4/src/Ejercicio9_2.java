import java.util.Scanner;

public class Ejercicio9_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = s.nextLine();

        String inv = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inv = inv + cadena.charAt(i);
        }

        System.out.println(inv);
        s.close();
    }
}