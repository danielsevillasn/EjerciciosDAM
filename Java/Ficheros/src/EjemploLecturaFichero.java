import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploLecturaFichero {
    public static void main(String[] args) {
        System.out.println("\nScanner:\n");
        /*
         * La clase Scanner es la usada en el siguiente ejemplo, su ventaja es que es un
         * poco mas sencilla.
         * Requiere un objeto File y un Objeto tipo Scanner.
         * Solo se podría lanzar una excepción cuando no se encuentra el archivo
         */
        File archivo = new File("c:/ejemplo.txt");
        try {
            Scanner lectura = new Scanner(archivo);
            while (lectura.hasNextLine()) {
                System.out.println(lectura.nextLine());
            }
            lectura.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nBufferedReader:\n");
        /*
         * El siguiente ejemplo está hecho con un BufferedReader.
         * Scanner puede leer enteros, chars, flotantes, decimales y líneas completas.
         * Esa es la diferencia.
         * Se podría lanzar una excepción de archivo no encontrado y en dado caso un
         * error de entrada salida,
         * puesto que es operación estrictamente I/O.
         */
        try {
            FileReader f = new FileReader("c:/ejemplo.txt");
            BufferedReader lectura = new BufferedReader(f);
            String linea = lectura.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lectura.readLine();
            }
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}