import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Consultar los datos del empleado con identificador 5. No es necesario
 * recorrer todos los
 * registros anteriores, para acceder a su posición, tener en cuenta que cada
 * empleado ocupa 36
 * bytes.
 * 
 * Ejercicio26
 */
public class Ejercicio26 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("datos.dat");

        RandomAccessFile raf = new RandomAccessFile(fichero, "r");
        int nEmpleado = 5;

        raf.seek(36*(nEmpleado-1));
        int id = raf.readInt();
        char[] apellidoChars = new char[10];
        for(int i = 0;i<apellidoChars.length;i++){
            apellidoChars[i] = raf.readChar();
        }
        String apellido = new String(apellidoChars);
        int dep = raf.readInt();
        double salario = raf.readDouble();

        System.out.println("El empleado "+id+" de apellido: "+apellido+" en el departamento "+dep+" y con un salario de "+salario+"€");
        raf.close();
    }
}
