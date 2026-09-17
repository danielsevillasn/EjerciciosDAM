import java.io.File;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dame la ruta o el nombre del directorio del que quieras ver su contenido: ");
        String nombreFichero = s.nextLine();

        File fichero = new File(nombreFichero);

        String[] lista = fichero.list();

        for(String nombreFicheros : lista){
            File f = new File(nombreFicheros);
            if (f.isDirectory()){
                System.out.println("Es un directorio");
            }else{
                System.out.println("Es un fichero y su  tamaño es de "+f.length());
            }
        }

        s.close();
    }
}

