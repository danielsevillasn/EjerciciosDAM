package Teoria.General;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero01 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
            String linea = "";
            while (linea != null) {
                linea = br.readLine();
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException fnfe) { // Si no en cuentra el fichero
            System.out.println("No se encuentra el fichero malaga.txt");
        } catch (IOException ioe) {// Que hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero malaga.txt");
        }
    }
}
