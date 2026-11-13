package modeloExamen1Evaluacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hilo que lee el contenido del fichero creado por el proceso hijo
 * 
 * HiloLector
 */
public class HiloLector implements  Runnable{
    private String nombreFichero;
    private MonitorEncuestas monitor;

    public HiloLector(String nombreFichero, MonitorEncuestas m){
        this.nombreFichero = nombreFichero;
        monitor = m;
    }

    @Override
    public void run() {
        File fichero = new File("bin", nombreFichero + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            int numero = Integer.parseInt(br.readLine());
            monitor.comprobarNumero(numero);
        } catch (IOException | NumberFormatException e) {
            // Si el encuestado abandona, no llega a crear su fichero.
            monitor.incrementarSinRespuesta();
        }
    }

}
