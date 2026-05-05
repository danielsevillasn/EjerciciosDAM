package EjerciciosRepaso.ArrayList_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Estructura: La clave es el IBAN (String) y el valor es la lista de movimientos (ArrayList)
        HashMap<String, ArrayList<Double>> cuentas = new HashMap<>();

        // 1. Registrar 3 cuentas con movimientos predefinidos
        // Usamos Arrays.asList para inicializar las listas de forma rápida
        cuentas.put("ES12345", new ArrayList<>(Arrays.asList(1500.0, -200.50, 100.0, -50.0)));
        cuentas.put("ES67890", new ArrayList<>(Arrays.asList(3000.0, -1200.0, -45.99)));
        cuentas.put("ES55555", new ArrayList<>(Arrays.asList(500.0, 250.0, -10.0)));

        // 2. Pedir al usuario un número de cuenta
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el número de cuenta a consultar: ");
        String cuentaBuscada = s.nextLine().toUpperCase();

        // 3. Verificar si existe e iterar sobre sus movimientos
        if (cuentas.containsKey(cuentaBuscada)) {
            ArrayList<Double> movimientos = cuentas.get(cuentaBuscada);
            double saldoActual = 0;

            System.out.println("\nHistorial de movimientos para " + cuentaBuscada + ":");
            System.out.println("-------------------------------------------");

            for (Double mov : movimientos) {
                // Imprimir cada movimiento con formato
                if (mov >= 0) {
                    System.out.printf("Ingreso: +%.2f€%n", mov);
                } else {
                    System.out.printf("Cargo:   %.2f€%n", mov);
                }
                // Calcular el saldo actual (operación agregada)
                saldoActual += mov;
            }

            System.out.println("-------------------------------------------");
            System.out.printf("SALDO ACTUAL: %.2f€%n", saldoActual);
        } else {
            System.out.println("Error: La cuenta " + cuentaBuscada + " no existe en nuestra base de datos.");
        }
        
        s.close();
    }
}
