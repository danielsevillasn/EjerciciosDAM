package EjerciciosPropuestosRepaso;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6SinSwing {
    public static void main(String[] args) {
        String nombreFichero = "vehiculos.dat";
        Scanner scanner = new Scanner(System.in);

        // 1. Petición de datos por consola y guardado en el fichero (Modo Append / No sobrescribir)
        try {
            System.out.print("Introduce la matrícula: ");
            String matricula = scanner.nextLine();

            if (matricula != null && !matricula.trim().isEmpty()) {
                System.out.print("Introduce la marca: ");
                String marca = scanner.nextLine();

                System.out.print("Introduce el tamaño de depósito (litros): ");
                double deposito = Double.parseDouble(scanner.nextLine());

                System.out.print("Introduce el modelo: ");
                String modelo = scanner.nextLine();

                // DataOutputStream para escribir. FileOutputStream(fichero, true) añade al final.
                try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreFichero, true))) {
                    dos.writeUTF(matricula);
                    dos.writeUTF(marca);
                    dos.writeDouble(deposito);
                    dos.writeUTF(modelo);
                    System.out.println("\nVehículo guardado correctamente en el fichero.\n");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEl tamaño del depósito debe ser un valor numérico válido.");
        } catch (IOException e) {
            System.out.println("\nError de E/S al guardar el archivo: " + e.getMessage());
        }

        // 2. Lectura y visualización en consola de todos los vehículos almacenados
        File fichero = new File(nombreFichero);
        if (fichero.exists()) {
            System.out.println("========================================");
            System.out.println("   LISTADO DE VEHÍCULOS EN EL FICHERO");
            System.out.println("========================================");
            
            try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
                // Bucle infinito que se detiene al llegar al final del fichero (EOFException)
                while (true) {
                    String matricula = dis.readUTF();
                    String marca = dis.readUTF();
                    double deposito = dis.readDouble();
                    String modelo = dis.readUTF();

                    System.out.println("• Matrícula : " + matricula);
                    System.out.println("• Marca     : " + marca);
                    System.out.println("• Depósito  : " + deposito + " L");
                    System.out.println("• Modelo    : " + modelo);
                    System.out.println("----------------------------------------");
                }
            } catch (EOFException e) {
                // Fin de fichero alcanzado de forma normal
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}