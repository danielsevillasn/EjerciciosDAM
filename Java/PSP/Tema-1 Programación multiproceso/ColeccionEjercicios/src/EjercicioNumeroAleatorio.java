import java.io.*;
import java.util.Scanner;

/**
 * El ejercicio está formado dos procesos, uno padre con el que interactúa el
 * usuario del programa vía teclado-monitor y un segundo (hijo) que devuelve un
 * número aleatorio de 1 a 10. - Proceso padre. Activo hasta que recibe la
 * entrada “Fin” (en cualquiera de sus combinaciones mayúsculas-minúsculas),
 * para cualquier otra entrada solicita al proceso hijo un número aleatorio
 * entre 1 y 10 y una vez recibido lo muestra por pantalla. - Proceso hijo. Ante
 * la llegada de cualquier texto desde el proceso padre, envía de vuelta el
 * número aleatorio calculado
 */
public class EjercicioNumeroAleatorio {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		String[] nombreProceso = {"/usr/java/jdk-24.0.2/bin/java","ProcesoHijoNumeroAleatorio"};
		ProcessBuilder pb = new ProcessBuilder(nombreProceso);
		Process proceso = null;
		pb.directory(new File("./bin"));
		Scanner s = new Scanner(System.in);
		String respuesta = "";
		
		try {
			proceso = pb.start();
			Writer w = new OutputStreamWriter(proceso.getOutputStream());
			BufferedReader r = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			
			while (true) {
				System.out.print("Introduce cualquier texto para pedir un número (o \"Fin\" para salir): ");
				respuesta = s.nextLine();
				
				if (respuesta.equalsIgnoreCase("Fin")) {
					w.write("Fin\n");
					w.flush();
					w.close();
					r.close();
					break;
				}
				
				w.write(respuesta+"\n");
				w.flush();
				
				String respuestaHijo = r.readLine();
				System.out.println("Número aleatorio recibido del hijo: " + respuestaHijo);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
        int codigoSalida = proceso.waitFor();
        System.out.println("Proceso hijo finalizado con código de salida: " + codigoSalida);

		if(proceso.isAlive()) {
			proceso.destroy();			
		}
		
		s.close();
	}
}
