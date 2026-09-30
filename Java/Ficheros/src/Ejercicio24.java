import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Insertar el apellido, departamento y salario de empleados en un fichero
 * aleatorio. Se obtienen de arrays y se
 * insertan de forma secuencial, por lo que no será necesario usar el método
 * seek(). Por cada empleado se insertará
 * también un identificador, que comenzará en 1. La longitud del registro de
 * cada empleado es 36 bytes:
 * - id (entero): 4 bytes
 * - apellido (10 caracteres x 2 bytes): 20 bytes
 * - departamento (entero): 4 bytes
 * - salario (double): 8 bytes
 * 
 * Ejercicio24
 */
public class Ejercicio24 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("datos.dat");
        RandomAccessFile inOut = new RandomAccessFile(fichero, "rw");

        String[] apellido = {"SEVILLA","FERNANDEZ","GIL","LOPEZ","RAMOS"};
        int[] dep = {10,20,30,40,50};
        double[] salario = {1100.5,1400,2000.23,3000,5000};
        int id = 1;
        StringBuilder sb = null;

        for(int i = 0;i < apellido.length;i++){
            inOut.writeInt(id++);
            sb = new StringBuilder(apellido[i]);
            sb.setLength(10);
            inOut.writeChars(sb.toString());
            inOut.writeInt(dep[i]);
            inOut.writeDouble(salario[i]);
        }
        inOut.close();
    }
}
