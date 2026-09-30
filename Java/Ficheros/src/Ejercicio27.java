import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.StringBuilder;

/**
 * Añadir un nuevo empleado al final.
 * 
 * Ejercicio27
 */
public class Ejercicio27 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("datos.dat");

        RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
        StringBuilder sb = new StringBuilder("Alvarez".toUpperCase());
        sb.setLength(10);

        raf.seek(raf.length());
        raf.writeInt(6);
        raf.writeChars(sb.toString());
        raf.writeInt(60);
        raf.writeDouble(2000);

        raf.close();
    }
}
