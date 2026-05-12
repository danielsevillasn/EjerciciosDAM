package EjerciciosGeneral.Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        if(args.length != 2){
            System.out.println("Has de pasar dos nombres de ficheros por parametro.");
            System.exit(-1);
        }

        try{
            File archivoMezcla = new File("./src/EjerciciosGeneral/Ejercicio3/mezcla.txt");
            BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoMezcla));
            String linea1 = "";
            String linea2 = "";

            while((linea1 != null) || (linea2 != null)){
                linea1 = br1.readLine();
                linea2 = br2.readLine();

                if(linea1 != null){
                    bw.write(linea1);
                    bw.newLine();
                }
                if(linea2 != null){
                    bw.write(linea2);
                    bw.newLine();
                }
            }

            br1.close();
            br2.close();
            bw.close();

            System.out.println("Archivo mezclado correctamente");
        }catch(FileNotFoundException e ){
            System.out.println("No se encuentra el archivo buscado");
        }catch(IOException e ){
            System.out.println("No se puede leer o escribir en este archivo");
        }
    }
}
