package EjerciciosClase;

import EjerciciosClase.Ejercicio34.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio35 {
    public static void main(String[] args) {
        String nombreFichero = "personas.dat";
        File archivo = new File(nombreFichero);

        // Verificamos si el fichero existe antes de intentar leerlo
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                
                // Leemos el objeto y hacemos el casting de vuelta a array de Persona[]
                Persona[] personasCargadas = (Persona[]) ois.readObject();

                System.out.println("========================================");
                System.out.println("   PERSONAS RECUPERADAS DEL FICHERO");
                System.out.println("========================================");
                
                // Recorremos el array mostrando cada persona
                for (int i = 0; i < personasCargadas.length; i++) {
                    System.out.println("Persona " + (i + 1) + ": " + personasCargadas[i]);
                }
                
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero '" + nombreFichero + "' no existe. Ejecuta primero el programa que guarda los datos.");
        }
    }
}