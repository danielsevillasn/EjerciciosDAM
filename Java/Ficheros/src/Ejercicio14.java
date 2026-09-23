import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Escribir un método que reciba por parámetro el nombre de un archivo e
 * imprima las cadenas que dicho archivo almacena
 * (una cadena por línea). Se tendrá en cuenta que las distintas cadenas se
 * separan en el archivo por un asterisco (que no se
 * imprimirá).
 * 
 * Ejercicio14
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        File ArchivoNombres = new File("ArchivoNombres.txt");
        String linea = "";
        StringBuilder nombresFichero = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(ArchivoNombres))) {
            while (linea != null){
                nombresFichero.append(linea);
                linea = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(nombresFichero);
        String[] nombres = nombresFichero.toString().split("\\*");
        for(String n : nombres){
            System.out.println(n);
        }
    }
}
