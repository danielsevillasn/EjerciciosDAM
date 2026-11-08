import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {
	public static void main(String[] args) {
		// No existe la entrada directory de ProcessBuilder. Poner ejecutables en la ruta del proyecto
		String[] sArg = new String[2];
		sArg[0] = "/usr/java/jdk-24.0.2/bin/java"; // Consultar localizacion con which java
		sArg[1] = "ProcesoHijo"; // .class, sin indicar
		// sArg[0] = "python3";
		// sArg[1] = "prueba.py";
		// String [] sArg = new String [1];
		// sArg[0] = "firefox";
		Process miProc = null;
		try {
		// El proceso hijo se debe encontrar en la ruta del proyecto
		// miProc = Runtime.getRuntime().exec(sArg);
		// Equivalente al metodo directory de proccesBuilder. Se puede indicar la ruta del proc hijo
			miProc = Runtime.getRuntime().exec(sArg, null, new File("./bin"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(miProc.pid()); // Pid del proceso iniciado
		// Enlazar salida estandar del proceso hijo con este proceso padre
		InputStream miIs = miProc.getInputStream();
		InputStreamReader miIsr = new InputStreamReader(miIs);
		BufferedReader miIsrb = new BufferedReader(miIsr);
		String sInfo = "";
		try {
			while ((sInfo = miIsrb.readLine()) != null) {
				System.out.println(sInfo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}