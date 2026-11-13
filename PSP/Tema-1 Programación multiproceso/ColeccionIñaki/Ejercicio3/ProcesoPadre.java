package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesoPadre {
    public static void main(String[] args) {
try {
            ProcessBuilder pb = new ProcessBuilder("java", "src\\Ejercicio3\\ProcesoHijo.java");
            
            Process proceso = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.print(linea+" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
