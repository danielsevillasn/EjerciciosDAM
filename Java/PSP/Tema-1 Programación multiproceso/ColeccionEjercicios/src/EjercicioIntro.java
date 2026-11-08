import java.io.*;

/**
 * Practicando algunas las funciones proporcionadas por las clases
 * ProcessBuilder, Runtime y Process disponibles en las librerías de Java. - Con
 * la clase ProcessBuilder. Lanzar procesos con array de entrada y con
 * secuencia de Strings. Lanzar aplicaciones disponibles (p.e firefox),
 * comandos linux, Script linux, otros programas Java, programas en otros
 * lenguajes. (p,e Python). Método directory de la clase ProcessBuilder. 
 * Capturar flujos de salida del proceso hijo en el proceso padre. Método
 * WaitFor. Captura de la salida del proceso. Método isAlive. - Con la clase
 * Runtime. Reproducir los mismos apartados que se han hecho con la clase
 * ProcessBuilder - Desarrollar las clases ProcBuilPadre, RunTimePadre y
 * ProcBuilHija
 */
public class EjercicioIntro {

	public static void main(String[] args) throws IOException {
		String[] procesoHijo = {"/usr/java/jdk-24.0.2/bin/java","ProcesoHijoIntro"};
		ProcessBuilder pb = new ProcessBuilder(procesoHijo);
		Process proceso = null;
		pb.directory(new File("./bin"));
		
		try {
			proceso = pb.start();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		
		Writer w = new OutputStreamWriter(proceso.getOutputStream());
		
		try {
			w.write("Hola hijo\n");
			w.flush();
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		int salida = 0;
		
		try {
			salida = proceso.waitFor();
		}catch (InterruptedException e) {
			System.out.println(e.getStackTrace());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream())); 
		String linea = "";
		while ((linea = br.readLine())!=null) {
			System.out.println(linea);
		}
		System.out.println("La salida es: "+salida);
		
	}

}
