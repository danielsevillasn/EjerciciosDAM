package EjerciciosGeneral;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio5 {
    public static void main(String[] args) {
        // 1. Validar argumentos de entrada
        if (args.length != 2) {
            System.out.println("Uso: java Ejercicio5 <programa_original.java> <programa_limpio.java>");
            return;
        }

        String archivoOrigen = args[0];
        String archivoDestino = args[1];

        try {
            // 2. Leer todo el contenido del archivo a una String
            // Usamos Files.readString (disponible desde Java 11) para facilitar el manejo de bloques
            String contenido = new String(Files.readAllBytes(Paths.get(archivoOrigen)));

            // 3. Aplicar Regex para eliminar comentarios
            // Este regex busca:
            // (/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+/): Comentarios de bloque /* ... */
            // |(//.*): Comentarios de línea //
            String contenidoLimpio = contenido.replaceAll("/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/|//.*", "");

            // 4. Guardar el resultado en el nuevo archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {
                bw.write(contenidoLimpio);
            }

            System.out.println("Proceso finalizado. El archivo limpio es: " + archivoDestino);

        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}