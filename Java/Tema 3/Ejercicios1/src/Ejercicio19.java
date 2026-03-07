import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero (hasta 5 cifras): ");
        int numero = sc.nextInt();

        // Si el número es negativo, lo convertimos a positivo
        if (numero < 0) {
            numero = -numero;
        }

        int digitos = 0;

        // Estructuras de selección para determinar la cantidad de dígitos
        if (numero < 10) {
            digitos = 1;
        } else if (numero < 100) {
            digitos = 2;
        } else if (numero < 1000) {
            digitos = 3;
        } else if (numero < 10000) {
            digitos = 4;
        } else if (numero < 100000) {
            digitos = 5;
        } else {
            System.out.println("El número tiene más de 5 cifras.");
            sc.close();
            return;
        }

        System.out.println("El número tiene " + digitos + " dígito(s).");

        sc.close();
    }
}