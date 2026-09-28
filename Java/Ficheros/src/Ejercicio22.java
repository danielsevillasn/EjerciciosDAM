import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Inserta en un fichero los datos de dos arrays, uno con el nombre de una serie
 * de personas y otro con sus edades.
 * 
 * Ejercicio22
 */
public class Ejercicio22 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("binario.dat");
        DataOutputStream ds = new DataOutputStream(new FileOutputStream(fichero));
        int[] edades = {2,5,10};
        String[] palabras = {"Pepe","Juan","Mario"};

        for(String p : palabras){
            ds.writeUTF(p);
        }
        for(int n : edades){
            ds.write(n);
        }
        ds.close();
    }
}
