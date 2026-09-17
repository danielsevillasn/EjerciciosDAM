import java.io.File;
import java.sql.Date;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dame la ruta o el nombre del fichero del que quieras ver sus atributos: ");
        String nombreFichero = s.nextLine();

        File fichero = new File(nombreFichero);

        if (fichero.exists()){
            System.out.println(fichero.getName()+" "+ fichero.getAbsolutePath()+" "+fichero.length());
            
            if (fichero.isFile()){
                System.out.println("Es un archivo");
            }else{
                System.out.println("Es un directorio");
            }
            
            System.out.println(new Date(fichero.lastModified()));
            
            if(fichero.canWrite()){
                System.out.println("Tiene permisos de escritura");
            }
    
            if(fichero.canRead()){
                System.out.println("Tiene permisos de lectura");
            }
    
            if(fichero.canExecute()){
                System.out.println("Tiene permisos de ejecución");
            }

        }else{
            System.out.println("No existe el fichero introducido");
        }
        s.close();
    }
}
