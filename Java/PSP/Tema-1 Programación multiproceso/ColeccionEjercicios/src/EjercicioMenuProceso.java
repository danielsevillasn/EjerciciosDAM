import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Opción Eco. Se pedirá por teclado un texto que se enviará al proceso hijo,
 * éste lo devolverá al proceso padre sin modificar, mostrándose por pantalla el
 * eco una vez recibido de vuelta. - Opción Saludo. Se envía al proceso hijo el
 * texto “SALUDO” y éste responde “HOLA, SOY TU HIJO”. Mostrar la respuesta
 * recibida por pantalla. - Opción Vivo. Comprueba si el proceso hijo está
 * activo, e informa por pantalla. - Opción Matar. Si el proceso hijo está
 * activo, lo finaliza. - Opción Resucitar. Si el proceso hijo no está activo,
 * vuelve a lanzarlo. - Opción Salir. Finaliza ambos procesos
 * 
 */
public class EjercicioMenuProceso {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("/usr/java/jdk-24.0.2/bin/java", "ProcesoHijoMenu");
		pb.directory(new File("./bin"));
		Process proceso = null;
		Scanner s = new Scanner(System.in);
		String respuesta = "";

		try {
			proceso = pb.start();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

			while (!respuesta.equalsIgnoreCase("Salir")) {
				System.out.println("Menu de Opciones. Pulsa:");
				System.out.println(" * Eco : para recibir un eco del otro proceso");
				System.out.println(" * Saludo : para recibir Hola del otro proceso");
				System.out.println(" * Vivo : para comprobar si el otro proceso esta vivo");
				System.out.println(" * Matar : para finalizar el otro proceso");
				System.out.println(" * Resucitar : para activar otro proceso hijo");
				System.out.println(" * Salir : para salir del programa");
				System.out.print(" * Indica tu opcion : ");
				respuesta = s.nextLine();

				switch (respuesta.toLowerCase().trim()) {
				case "eco":
					if(!proceso.isAlive()) {
						System.out.println("El proceso esta muerto");
						break;
					}
					System.out.print("Dame un mensaje del que quieras recibir un \"eco\":");
					bw.write(s.nextLine() + "\n");
					bw.flush();
					System.out.println("Respuesta del hijo: "+br.readLine());
					break;
				case "saludo":
					if(!proceso.isAlive()) {
						System.out.println("El proceso esta muerto");
						break;
					}
					bw.write("SALUDO\n");
					bw.flush();
					System.out.println("Respuesta del hijo: "+br.readLine());
					break;
				case "vivo":
					if (proceso.isAlive()) {
						System.out.println("El proceso hijo esta vivo");
					} else {
						System.out.println("El proceso hijo ha muerto");
					}
					break;
				case "matar":
					if (proceso.isAlive()) {
						proceso.destroy();
						System.out.println("Proceso eliminado");
					} else {
						System.out.println("El proceso ya estaba eliminado");
					}
					break;
				case "resucitar":
					if (proceso.isAlive()) {
						System.out.println("El proceso ya estaba vivo");
					} else {
						bw.close();
						br.close();
						proceso = pb.start();
						bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
                        br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
						System.out.println("Proceso resucitado");
					}
					break;
				default:
					if(!respuesta.equalsIgnoreCase("Salir")) {
						System.out.println("Tienes que escribir una de las opciones del menu");						
					}
					break;
				}
				System.out.println("\n");
			}
			System.out.println("Saliendo...");
			if(proceso.isAlive()) {
				proceso.destroy();				
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		s.close();

	}

}
