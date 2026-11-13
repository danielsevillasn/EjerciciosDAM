package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class ProcesoHijo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int numeroAleatorio = random.nextInt(10) + 1;

            System.out.println(numeroAleatorio);
        }
        scanner.close();
    }
}
