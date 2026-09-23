import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Escribe un programa que escriba los 100 primeros números naturales en un
 * archivo numNaturales.txt
 * 
 * Ejercicio11
 */
public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        File numNaturales = new File("numNaturales.txt");
        PrintWriter out = new PrintWriter(new FileWriter(numNaturales));
        for (int i = 0; i <= 100; i++) {
            out.println(i);
        }
        out.flush();
        out.close();
    }
}
