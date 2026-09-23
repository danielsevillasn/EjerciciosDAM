import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.util.logging.Level;

public class EjemploEncoding {
    public static void main(String[] args) {
        FileInputStream fichero;
        try {
            // Elegimos fichero para leer flujos de bytes "crudos"
            fichero = new FileInputStream("/home/alumnom/Documentos/EjerciciosDAM/Java/Ficheros/src/EjemploSeparator.java");
            try (
            InputStreamReader unReader = new InputStreamReader(fichero)) { // InputStreamReader sirve de puente de flujos de byte a caracteres
                // Vemos la codificación actual
                System.out.println(unReader.getEncoding());
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploEncoding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}