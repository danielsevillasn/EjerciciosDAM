//Escribe un programa que pida un número entero (de hasta 5 cifras) y diga cuál es la primera cifra.
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero (hasta 5 cifras): ");
        int numero = sc.nextInt();

        // Convertir a positivo si es negativo
        if (numero < 0) {
            numero = -numero;
        }

        int primeraCifra = 0;

        // Estructura de selección para determinar la primera cifra según el rango
        if (numero < 10) {
            primeraCifra = numero;
        } else if (numero < 100) {
            primeraCifra = numero / 10;
        } else if (numero < 1000) {
            primeraCifra = numero / 100;
        } else if (numero < 10000) {
            primeraCifra = numero / 1000;
        } else if (numero < 100000) {
            primeraCifra = numero / 10000;
        } else {
            System.out.println("El número tiene más de 5 cifras.");
            sc.close();
            return;
        }

        System.out.println("La primera cifra del número es: " + primeraCifra);

        sc.close();
    }
}