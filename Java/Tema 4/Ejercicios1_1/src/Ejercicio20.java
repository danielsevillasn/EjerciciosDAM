import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número total de nombres de reyes: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] reyes = new String[n];

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

        for (int i = 0; i < n; i++) {
            reyes[i] = sc.nextLine();
        }

        System.out.println("\nLos reyes introducidos son:");

        for (int i = 0; i < n; i++) {
            int contador = 1;

            // Contar cuántas veces ha aparecido antes el mismo nombre
            for (int j = 0; j < i; j++) {
                if (reyes[j].equals(reyes[i])) {
                    contador++;
                }
            }

            System.out.println(reyes[i] + " " + contador + "º");
        }

        sc.close();
    }
}