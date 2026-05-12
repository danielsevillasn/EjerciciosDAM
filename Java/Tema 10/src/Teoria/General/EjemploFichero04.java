package Teoria.General;

import java.io.File;
import java.io.IOException;

public class EjemploFichero04 {
    public static void main(String[] args) throws IOException {
        File f = new File("./src"); // El punto significa que el archivo se creara en el directorio actual

        File.createTempFile("pepe", ".txt", f); //Crea un achivo pepe.txt
        String[] listaArchivos = f.list();
        for(String nombreArchivo : listaArchivos){
            System.out.println(nombreArchivo);
        }
    }
}
