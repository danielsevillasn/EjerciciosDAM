package EjerciciosGeneral;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

            String linea = "";

            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }catch(IOException e){
            System.out.println("Linea no encontrada");
        }
    }
}
