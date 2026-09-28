import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copiar el contenido de un fichero en otro
 * 
 * Ejercicio20
 */
public class Ejercicio20 {
    public static void main(String[] args) throws IOException {
        DataInputStream Dis = new DataInputStream(new FileInputStream("datos.mbd"));
        DataOutputStream Dos = new DataOutputStream(new FileOutputStream("datos2.mbd"));
        Dos.write(Dis.readAllBytes());
        Dis.close();
        Dos.close();
    }
}
