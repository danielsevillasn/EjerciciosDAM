import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesoHijoNumeroAleatorio {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                if (linea.equalsIgnoreCase("Fin")) {
                    break;
                }

                int numeroAleatorio = (int) ((Math.random() * 10) + 1);

                System.out.println(numeroAleatorio);
                System.out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}