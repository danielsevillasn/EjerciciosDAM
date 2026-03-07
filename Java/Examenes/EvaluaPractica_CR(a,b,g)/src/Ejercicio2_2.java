import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        String frase = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una vocal: ");
        String v = s.nextLine();

        frase = frase.replaceAll("[aeiou]", v); //El regex sirve para describir un patron de texto y lo busca de la manera que tu quieras
        //En este caso los corchetes sirve para buscar un solo caracter de todos los que estan dentro de ese
        //Y si encuentra uno, lo remplaza por la variable V
        System.out.println(frase);
        s.close();
    }
}