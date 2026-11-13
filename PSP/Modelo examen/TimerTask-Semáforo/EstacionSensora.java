import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Aplicación Estación Sensora (Proceso Hijo)
 * 
 * Modela una estación sensora de calidad del aire que:
 * 1. Genera un identificador único basado en System.currentTimeMillis().
 * 2. Informa al proceso padre enviando dicho identificador por la salida estándar.
 * 3. Simula la toma de muestras de concentración de partículas PM2.5.
 * 4. Aplica una probabilidad de fallo (20%) donde no genera fichero.
 * 5. Si tiene éxito, escribe el resultado en un fichero denominado <id_estacion>.txt.
 */
public class EstacionSensora {

    public static void main(String[] args) {
        String idEstacion = "EST-" + System.currentTimeMillis();

        try {
            // Espera aleatoria inicial de calibración entre 0 y 500 ms
            Thread.sleep((int) (Math.random() * 501));

            // Informa inmediatamente al proceso padre de su identificador
            System.out.println(idEstacion);
            System.out.flush();

            // Probabilidad de fallo: 1 de cada 5 estaciones (20%) falla y no responde
            if (Math.random() < 0.20) {
                // Finaliza prematuramente sin generar fichero
                return;
            }

            // Simulación del tiempo de medición (entre 1 y 3 segundos)
            int tiempoReflexion = (int) (Math.random() * 2001) + 1000;
            Thread.sleep(tiempoReflexion);

            // Genera valor aleatorio de concentración PM2.5 entre 1 y 100 µg/m³
            int valorPM25 = (int) (Math.random() * 100) + 1;

            // Creación del fichero <id_estacion>.txt en el directorio de trabajo
            File ficheroSalida = new File(idEstacion + ".txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {
                bw.write(String.valueOf(valorPM25));
            }

        } catch (InterruptedException e) {
            System.err.println("Estación " + idEstacion + " interrumpida durante la ejecución.");
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            System.err.println("Error de E/S en la estación " + idEstacion + ": " + e.getMessage());
        }
    }
}