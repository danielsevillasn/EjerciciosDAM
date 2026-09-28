import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Visualiza los datos guardados en el ejercicio anterior en el mismo orden que
 * se escribieron, es decir, primero el
 * nombre y luego la edad
 * 
 * Ejercicio22
 */
public class Ejercicio23 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("binario.dat");

        try (DataInputStream di = new DataInputStream(new FileInputStream(fichero))) {
            while (true) {
                String nombre = di.readUTF();
                int edad = di.readInt();

                System.out.println("Nombre: " + nombre + " | Edad: " + edad);
            }
        } catch (EOFException e) {
            System.out.println("--- Fin de la lectura del fichero ---");
        }
    }
}