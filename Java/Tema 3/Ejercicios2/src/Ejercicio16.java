import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = s.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // 0, 1 y negativos no son primos
        } else {
            for (int i = 2; i < numero; i++) { //Comprueba si el número es divisible entre algún número entre 2 y numero-1
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        s.close();
    }
}