package EjerciciosGeneral;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("primos.dat"));

            boolean esPrimo = false;
            for (int i = 2; i < 500; i++) {
                esPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0){
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    br.write(i + "\n");
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en este archivo");
        }
    }
}
