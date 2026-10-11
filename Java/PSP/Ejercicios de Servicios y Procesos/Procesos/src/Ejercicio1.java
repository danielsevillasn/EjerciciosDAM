import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        String[] nombreProceso = {"cmd.exe", "/C", "dir"};
        ProcessBuilder pb = new ProcessBuilder(nombreProceso);
        Process p = null;
        
        try{
            p = pb.start();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String linea = "";
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }
    }
}
