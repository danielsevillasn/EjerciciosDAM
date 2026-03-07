import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        String frase = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una vocal: ");
        String v = s.nextLine();

        frase = frase.replaceAll("[aeiou]", v);

        System.out.println(frase);
        s.close();
    }
}