import java.io.*;

public class EjemploEscrituraFichero {
    public static void main(String[] args) throws IOException {
        // array de nombres
        String[] nombres = { "ana", "rosa", "jorge", "manuel" };
        FileWriter fw = new FileWriter("datos.txt");
        PrintWriter out = new PrintWriter(fw);
        for (int i = 0; i < nombres.length; i++) {
            out.println(nombres[i]);
        }
        out.flush();
        out.close();
    }
}