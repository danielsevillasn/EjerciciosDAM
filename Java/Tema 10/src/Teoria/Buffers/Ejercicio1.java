import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ruta del archivo descargado de Gutenberg
        String rutaFichero = "pg2000.txt";

        // Usamos un HashMap para contar frecuencias: Clave = Palabra, Valor = Cantidad
        Map<String, Integer> mapaFrecuencias = new HashMap<>();

        // Optimización de la lectura mediante BufferedReader [cite: 18, 20]
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividimos la línea en palabras usando espacios en blanco
                String[] palabras = linea.split("\\s+");

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        // Actualizamos el contador en el mapa
                        mapaFrecuencias.put(palabra, mapaFrecuencias.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }

        // Convertimos el mapa a una lista para poder ordenarlo por valor (frecuencia)
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(mapaFrecuencias.entrySet());

        // Ordenamos de mayor a menor frecuencia
        listaOrdenada.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Mostramos las 100 palabras más repetidas
        System.out.println("--- Top 100 palabras más repetidas ---");
        int limite = Math.min(100, listaOrdenada.size());
        for (int i = 0; i < limite; i++) {
            Map.Entry<String, Integer> entrada = listaOrdenada.get(i);
            System.out.printf("%d. %s: %d%n", (i + 1), entrada.getKey(), entrada.getValue());
        }
    }
}