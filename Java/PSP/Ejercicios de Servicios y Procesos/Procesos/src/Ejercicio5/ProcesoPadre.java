package Ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "src\\Ejercicio5\\ProcesoHijo.java");
            Process procesoHijo = pb.start();

            BufferedWriter escritorHijo = new BufferedWriter(new OutputStreamWriter(procesoHijo.getOutputStream()));
            BufferedReader lectorHijo = new BufferedReader(new InputStreamReader(procesoHijo.getInputStream()));

            Scanner scannerTeclado = new Scanner(System.in);
            System.out.println("=== PROGRAMA PADRE INICIADO ===");
            System.out.println("Pulsa INTRO para solicitar un número aleatorio, o escribe 'fin' para salir.");

            while (true) {
                System.out.print("\nIntroduce un comando: ");
                String entrada = scannerTeclado.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    System.out.println("Cerrando la aplicación...");
                    break;
                }

                escritorHijo.write("solicitar_numero\n");
                escritorHijo.flush();

                String respuestaHijo = lectorHijo.readLine();
                if (respuestaHijo != null) {
                    System.out.println(respuestaHijo);
                } else {
                    System.out.println("El proceso hijo se ha cerrado inesperadamente.");
                    break;
                }
            }

            procesoHijo.destroy();
            scannerTeclado.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
