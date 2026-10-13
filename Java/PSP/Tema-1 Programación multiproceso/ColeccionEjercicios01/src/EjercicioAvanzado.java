import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * El programa padre lee del fichero procesos.txt, que dispone de una serie de
 * entradas con información del tipo: nombre del proceso espacio ruta de su
 * fichero. - Iniciará tantos procesos hijos como entradas haya en el fichero
 * (vamos a considerar un máximo de cinco), a cada uno de ellos, le pasará la
 * ruta del fichero con el que deberán trabajar (dato recogido del fichero
 * procesos.txt). - Cada proceso estará parado un tiempo aleatorio (máximo tres
 * segundos), y a partir de ahí leerá el fichero que ha recibido desde el
 * proceso padre, enviando de vuelta cada uno de sus registros. Los ficheros
 * leídos por los proceso tendrán nombre de personas formados por una sola
 * palabra. - El proceso padre que irá recibiendo información de cada proceso
 * hijo, guardará todos los registros en una estructura de datos dinámica, que
 * garantice que se van guardando de forma ordenada alfabéticamente. - Una vez
 * hayan terminado todos los procesos, el programa padre mostrará por pantalla
 * la información contenida en la colección
 */
public class EjercicioAvanzado {

	public static void main(String[] args) {
		ArrayList<String> coleccionNombres = new ArrayList<String>();
		File archivoProcesos = new File("src/procesos.txt");
		ProcessBuilder pb = null;
		Process proceso = null;
		ArrayList<Process> procesos = new ArrayList<Process>();

		try (BufferedReader br = new BufferedReader(new FileReader(archivoProcesos))) {
            String linea;
            int contadorProcesos = 0;

            while ((linea = br.readLine()) != null && contadorProcesos < 5) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                	String[] partes = linea.split(" ");
	                if (partes.length >= 2) {
	                    String nombreProceso = partes[0];
	                    String rutaFichero = partes[1];
	
	                    pb = new ProcessBuilder("/usr/java/jdk-24.0.2/bin/java", nombreProceso, rutaFichero);
	                    pb.directory(new File("./bin"));
	                    proceso = pb.start();
	                    
	                    procesos.add(proceso);
	                    contadorProcesos++;
	                }
                
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		for(Process p : procesos) {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))){
				String linea = "";
				while((linea = br.readLine()) != null) {
					coleccionNombres.add(linea.trim());
				}
				p.waitFor();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}catch (InterruptedException e) {
				System.out.println("El thread ha sido interrumpido");
			}
		}
		Collections.sort(coleccionNombres);
		for(String n : coleccionNombres) {
			System.out.println(n);
		}
	}

}
