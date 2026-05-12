package EjerciciosGeneral;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        // 1. Validar que se ha pasado el archivo por argumento
        if (args.length != 1) {
            System.out.println("Por favor, introduce el nombre del archivo: java Ejercicio4 <archivo.txt>");
            return;
        }

        String nombreOriginal = args[0];
        String nombreSalida = generarNombreSort(nombreOriginal);
        ArrayList<String> palabras = new ArrayList<>();

        // 2. Leer el archivo y guardar palabras en la lista
        try (BufferedReader br = new BufferedReader(new FileReader(nombreOriginal))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                palabras.add(linea);
            }

            // 3. Ordenar la lista alfabéticamente
            Collections.sort(palabras);

            // 4. Escribir el resultado en el nuevo archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreSalida))) {
                for (String p : palabras) {
                    bw.write(p);
                    bw.newLine();
                }
            }

            System.out.println("Archivo ordenado creado: " + nombreSalida);

        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo " + nombreOriginal);
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }

    /**
     * Método auxiliar para transformar "palabras.txt" en "palabras_sort.txt"
     */
    private static String generarNombreSort(String nombre) {
        int punto = nombre.lastIndexOf(".");
        if (punto == -1) {
            return nombre + "_sort";
        }
        return nombre.substring(0, punto) + "_sort" + nombre.substring(punto);
    }
}