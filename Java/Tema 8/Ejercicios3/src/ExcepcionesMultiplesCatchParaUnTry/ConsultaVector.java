import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultaVector {

    public static void main(String[] ar) {
        int[] vec = { 20, 45, 76, 81, 34, 567, 423, 6, 3, 5 };
        Scanner teclado = new Scanner(System.in);
        int indice;
        try {
            System.out.print("Ingrese un valor entre 0 y 9:");
            indice = teclado.nextInt();
            System.out.print("En el vector se almacena en la posición " + indice + " el valor " + vec[indice]);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente número entero");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("El valor debe estar entre 0 y 9");

        }
        teclado.close();
    }
}