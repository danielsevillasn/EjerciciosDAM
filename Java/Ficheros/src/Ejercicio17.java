import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Escribir un método que reciba por parámetro un nombre de archivo para dejar
 * sus líneas
 * ordenadas alfabéticamente (no distinguir minúsculas de mayúsculas a la hora
 * de ordenar)
 * 
 * Ejercicio17
 */
public class Ejercicio17 {
/**
     * Lee un archivo, ordena sus líneas alfabéticamente (sin distinguir mayúsculas/minúsculas)
     * y sobrescribe el archivo original con el resultado.
     * 
     * @param nombreArchivo Ruta o nombre del archivo a ordenar
     */
    public static void ordenarLineasArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }

        Collections.sort(lineas, String.CASE_INSENSITIVE_ORDER);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 0; i < lineas.size(); i++) {
                bw.write(lineas.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ordenarLineasArchivo("salida.txt");
    }
}
