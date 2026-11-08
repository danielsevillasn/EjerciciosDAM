package modeloExamen1Evaluacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Proceso hijo que imprime su nombre y escribe un numero aleatorio en un fichero de texto
 * 
 * Encuestado
 */
public class Encuestado {
	public static void main(String[] args) throws InterruptedException {
		long nombreProcesoHijo = System.currentTimeMillis();
		try {
			Thread.sleep((int) (Math.random() * 500));

			System.out.println(nombreProcesoHijo);

			if (Math.random() < 0.20) {
				return;
			}

			Thread.sleep((int) (Math.random() * 2001) + 1000);

			int numeroAleatorio = (int) (Math.random() * 9 + 1);

			File archivoEncuestadoFile = new File(nombreProcesoHijo + ".txt");
			archivoEncuestadoFile.createNewFile();

			BufferedWriter bw = new BufferedWriter(new FileWriter(archivoEncuestadoFile));
			bw.write(String.valueOf(numeroAleatorio));
			bw.close();

		} catch (InterruptedException e) {
			System.out.println("Proceso hijo " + nombreProcesoHijo + " interrumpido");
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		}
	}
}
