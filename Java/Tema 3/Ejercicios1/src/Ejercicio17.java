import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Obtenemos la última cifra
        int ultimaCifra = numero % 10;

        // Estructura de selección (por si el número es negativo)
        if (ultimaCifra < 0) {
            ultimaCifra = -ultimaCifra; // La volvemos positiva
        }

        System.out.println("La última cifra del número es: " + ultimaCifra);

        sc.close();
    }
}
