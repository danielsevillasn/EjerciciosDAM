package Teoria.General;

import java.io.File;
import java.util.Scanner;

public class EjemploFichero05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Introduzca el nombre del archivo que desa borrar: ");
            String nombreFichero = s.nextLine();
            File fichero = new File(nombreFichero);
    
            if(fichero.exists()){
                fichero.delete();
                System.out.println("El fichero se ha borrado correctamente");
                break;
            } else{
                System.out.println("El fichero "+nombreFichero+" no existe");
            }
            
        }
        s.close();
    }
}
