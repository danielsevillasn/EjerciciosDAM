import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ProcesoHijoAvanzado {

	public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("No se ha proporcionado la ruta del fichero.");
            return;
        }

        String rutaFichero = args[0];

        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(3001));

            File fichero = new File(rutaFichero);

            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (!linea.trim().isEmpty()) {
                        System.out.println(linea.trim());
                    }
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (InterruptedException e) {
            System.out.println("Proceso hijo interrumpido.");
        }
    }

}
