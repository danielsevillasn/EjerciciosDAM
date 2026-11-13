package EjerciciosClase.Ejercicio34;
import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreFichero = "personas.dat";

        System.out.print("¿Cuántas personas deseas registrar? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        // 1. Creación del array de personas
        Persona[] personas = new Persona[cantidad];

        // 2. Rellenar el array con los datos introducidos por teclado
        for (int i = 0; i < personas.length; i++) {
            System.out.println("\n--- Persona " + (i + 1) + " ---");
            System.out.print("Introduce el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce los apellidos: ");
            String apellidos = scanner.nextLine();

            // Creamos el objeto y lo guardamos en la posición 'i' del array
            personas[i] = new Persona(nombre, apellidos);
        }

        // 3. Guardar (serializar) el array completo en el fichero
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            oos.writeObject(personas);
            System.out.println("\n[✔] Array de personas guardado correctamente en '" + nombreFichero + "'.");
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }

        // 4. Leer el fichero para comprobar y mostrar el contenido almacenado
        System.out.println("\n========================================");
        System.out.println("   PERSONAS RECUPERADAS DEL FICHERO");
        System.out.println("========================================");

        File archivo = new File(nombreFichero);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                // Leemos el objeto y hacemos casting de vuelta a array de Persona
                Persona[] personasCargadas = (Persona[]) ois.readObject();

                for (Persona p : personasCargadas) {
                    System.out.println(p);
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }

        scanner.close();
    }
}