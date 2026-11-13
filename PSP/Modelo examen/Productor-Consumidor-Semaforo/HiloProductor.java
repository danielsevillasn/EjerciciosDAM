import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hilo productor que simula la Grúa Pórtico de Descarga.
 * Lee el manifiesto generado por un buque (<id_buque>.txt) y deposita sus contenedores en el almacén.
 */
public class HiloProductor implements Runnable {

    private final AlmacenDeTransitoIntermedio almacen;
    private final String idBuque;

    public HiloProductor(AlmacenDeTransitoIntermedio almacen, String idBuque) {
        this.almacen = almacen;
        this.idBuque = idBuque;
    }

    @Override
    public void run() {
        File fichero = new File(idBuque + ".txt");

        // Si el buque sufrió avería o cuarentena, el fichero no existe
        if (!fichero.exists()) {
            almacen.registrarIncidencia(idBuque);
            return;
        }

        almacen.registrarBuqueConDescarga(idBuque);

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    int tipo = Integer.parseInt(linea);
                    String etiqueta = AlmacenDeTransitoIntermedio.obtenerEtiquetaContenedor(tipo);
                    almacen.depositar(etiqueta);
                    Thread.sleep(70); // Simulación de maniobra física de la grúa
                }
            }
        } catch (IOException e) {
            System.err.println("Error de lectura en manifiesto del buque " + idBuque + ": " + e.getMessage());
            almacen.registrarIncidencia(idBuque);
        } catch (InterruptedException e) {
            System.err.println("Grúa pórtico interrumpida en buque " + idBuque + ": " + e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            // Limpieza del fichero temporal del manifiesto tras procesarlo
            if (fichero.exists()) {
                fichero.delete();
            }
        }
    }
}
