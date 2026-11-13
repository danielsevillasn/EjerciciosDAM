import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProcesoHijo {
    public static void main(String[] args) {
        String id_furgontea = "FURGO-" + System.currentTimeMillis();

        try {
            // Retardo aleatorio de atraque inicial entre 0 y 400 ms
            Thread.sleep((int) (Math.random() * ((400-0)+1)+0));

            // Comunica inmediatamente su identificador por salida estándar
            System.out.println(id_furgontea);
            System.out.flush();

            // Simula labores de descarga entre 1 y 2,5 segundos
            int tiempoDescarga = (int) (Math.random() * (2500-1000)+1) + 1000;
            Thread.sleep(tiempoDescarga);

            // Probabilidad de avería o retraso (20%)
            if (Math.random() < 0.20) {
                // Finaliza su ejecución sin llegar a escribir ningún fichero
                return;
            }

            // Generación de entre 2 y 4 paquetes
            int numeroContenedores = (int) (Math.random() * 3) + 2;
            File ficheroManifiesto = new File(id_furgontea + ".txt");

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroManifiesto))) {
                for (int i = 0; i < numeroContenedores; i++) {
                    // Código numérico entre 1 y 5
                    int categoriaMercancia = (int) (Math.random() * ((5-1)+1)) + 1;
                    bw.write(String.valueOf(categoriaMercancia));
                    bw.newLine();
                }
            }

        } catch (InterruptedException e) {
            System.err.println("Buque " + id_furgontea + " interrumpido: " + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            System.err.println("Error de E/S en buque " + id_furgontea + ": " + e.getMessage());
        }
    }
}
