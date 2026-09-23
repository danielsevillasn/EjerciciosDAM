import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribir un método que reciba un array de cadenas de caracteres y vuelque su
 * contenido a un archivo cuyo nombre también
 * se recibirá por parámetro. Las cadenas quedarán separadas en el archivo por
 * un asterisco
 * 
 * Ejercicio13
 */
public class Ejercicio13 {
    public static void main(String[] args) throws IOException {
        String[] nombres = { "Pepe", "Juan", "Mario", "Daniel" };
        File ArchivoNombres = new File("ArchivoNombres.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(ArchivoNombres));

        for (String n : nombres) {
            bw.write("*" + n);
        }
        bw.write("*");

        bw.flush();
        bw.close();
    }
}
