import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Visualizar el fichero del ejercicio anterior. La posición inicial será 0 y
 * para recuperar los
 * siguientes registros hay que sumar 36 a la variable utilizada para el
 * posicionamiento.
 * 
 * Ejercicio25
 */
public class Ejercicio25 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("datos.dat");

        RandomAccessFile raf = new RandomAccessFile(fichero, "r");

        while (raf.getFilePointer() < raf.length()) {
            int id = raf.readInt();

            char[] apellidoArr = new char[10];
            for (int i = 0; i < 10; i++) {
                apellidoArr[i] = raf.readChar();
            }
            String apellido = new String(apellidoArr);

            int dep = raf.readInt();

            double salario = raf.readDouble();

            System.out.printf("ID: %-2d | Apellido: %-10s | Dep: %-2d | Salario: %.2f €%n",
                    id, apellido, dep, salario);
        }

        raf.close();
    }
}