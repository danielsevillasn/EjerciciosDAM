import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escribe un programa que reciba el nombre de un archivo que almacena una serie
 * de cantidades enteras positivas e imprima
 * su suma.
 * 
 * Ejercicio12
 */
public class Ejercicio12 {
    public static void main(String[] args) throws FileNotFoundException {
        File ArchivoSuma = new File("ArchivoSuma.txt");
        int suma = 0;
        Scanner s = new Scanner(ArchivoSuma);
        while (s.hasNextInt()) {
            suma += s.nextInt();
        }
        s.close();
        System.out.println("La suma es de: " + suma);
    }
}
