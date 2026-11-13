import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AplicacionBuqueMercante {
    public static void main(String[] args) {
        String idBuque = "BUQUE-" + System.currentTimeMillis();

        try {
            // Retardo aleatorio de atraque inicial entre 0 y 500 ms
            Thread.sleep((int) (Math.random() * 501));

            // Comunica inmediatamente su identificador por salida estándar
            System.out.println(idBuque);
            System.out.flush();

            // Simula labores de amarre y preparación entre 1 y 3 segundos
            int tiempoAmarre = (int) (Math.random() * 2001) + 1000;
            Thread.sleep(tiempoAmarre);

            // Probabilidad de avería o cuarentena aduanera (20%)
            if (Math.random() < 0.20) {
                // Finaliza su ejecución sin llegar a escribir ningún fichero
                return;
            }

            // Generación de entre 2 y 4 contenedores
            int numeroContenedores = (int) (Math.random() * 3) + 2;
            File ficheroManifiesto = new File(idBuque + ".txt");

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroManifiesto))) {
                for (int i = 0; i < numeroContenedores; i++) {
                    // Código numérico entre 1 y 6
                    int categoriaMercancia = (int) (Math.random() * 6) + 1;
                    bw.write(String.valueOf(categoriaMercancia));
                    bw.newLine();
                }
            }

        } catch (InterruptedException e) {
            System.err.println("Buque " + idBuque + " interrumpido: " + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            System.err.println("Error de E/S en buque " + idBuque + ": " + e.getMessage());
        }
    }
}
