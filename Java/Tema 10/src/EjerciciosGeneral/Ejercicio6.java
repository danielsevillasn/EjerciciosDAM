package EjerciciosGeneral;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String[] args) {
        // 1. Verificar que se pasen los dos argumentos necesarios
        if (args.length != 2) {
            System.out.println("Uso: java Ejercicio6 <nombre_fichero> <palabra>");
            return;
        }

        String nombreFichero = args[0];
        String palabraObjetivo = args[1];
        int contadorTotal = 0;

        // 2. Abrir el archivo para lectura
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                int indice = 0;
                
                // 3. Buscar la palabra en la línea actual repetidamente
                while ((indice = linea.indexOf(palabraObjetivo, indice)) != -1) {
                    contadorTotal++;
                    // Movemos el índice para seguir buscando después de la ocurrencia hallada
                    indice += palabraObjetivo.length();
                }
            }

            System.out.println("La palabra '" + palabraObjetivo + "' aparece " + contadorTotal + " veces en el fichero.");

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}