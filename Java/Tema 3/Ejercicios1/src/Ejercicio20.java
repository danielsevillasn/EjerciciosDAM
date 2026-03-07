//Escribe un programa que pida un número entero positivo de hasta 5 cifras y determine si es capicúa.
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un número entero positivo (hasta 5 cifras): ");
        numero = sc.nextInt();

        if (numero < 0 || numero > 99999) {
            System.out.println("Número fuera del rango permitido (0 - 99999).");
        } else {
            boolean esCapicua = false;

            // CASO 1: número de 1 cifra
            if (numero < 10) {
                esCapicua = true;
            }
            // CASO 2: número de 2 cifras
            else if (numero < 100) {
                int d1 = numero / 10;
                int d2 = numero % 10;
                esCapicua = (d1 == d2);
            }
            // CASO 3: número de 3 cifras
            else if (numero < 1000) {
                int d1 = numero / 100;
                int d3 = numero % 10;
                esCapicua = (d1 == d3);
            }
            // CASO 4: número de 4 cifras
            else if (numero < 10000) {
                int d1 = numero / 1000;
                int d2 = (numero / 100) % 10;
                int d3 = (numero / 10) % 10;
                int d4 = numero % 10;
                esCapicua = (d1 == d4) && (d2 == d3);
            }
            // CASO 5: número de 5 cifras
            else {
                int d1 = numero / 10000;
                int d2 = (numero / 1000) % 10;
                int d4 = (numero / 10) % 10;
                int d5 = numero % 10;
                esCapicua = (d1 == d5) && (d2 == d4);
            }

            if (esCapicua) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }

        sc.close();
    }
}