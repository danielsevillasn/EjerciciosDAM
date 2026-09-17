import java.io.File;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dame la ruta o el nombre del fichero del que quieras quitar permisos: ");
        String nombreFichero = s.nextLine();

        File fichero = new File(nombreFichero);

        if(fichero.canExecute()){
            fichero.setExecutable(false);
        }
        if(fichero.canRead()){
            fichero.setReadable(false);
        }

        s.close();
    }
}
