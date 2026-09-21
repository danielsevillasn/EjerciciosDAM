import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjemploFileWriter {
    public static void main(String[] args) {
        try {
            PrintWriter out = null;
            out = new PrintWriter(new FileWriter("salida.txt", true));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = "";
            do{                
                System.out.println("Escribe una línea que quieras implementar en el archivo: ");
                out.println(s);
            }while(!(s = br.readLine()).equals("salir"));
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
