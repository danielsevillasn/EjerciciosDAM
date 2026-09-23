import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ejercicio4 {
	public static void main(String[] args) {
		String[] sArg = new String[2];
		sArg[0] = "/usr/java/jdk-24.0.2/bin/java"; // Consultar localizacion con which java
		sArg[1] = "ProcesoHijo3"; // .class, sin indicar
		ProcessBuilder mipb = null;
		Process miProc = null;
		mipb = new ProcessBuilder(sArg);
		mipb.directory(new File("./bin"));
		try {
			miProc = mipb.start(); // Inicia el proceso
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(miProc.pid()); // Pid del proceso iniciado
		// Enlazar entrada estandar del proceso hijo con este proceso padre
		Writer wr = new OutputStreamWriter(miProc.getOutputStream());
		try {
			wr.write("HOLA\n");
			wr.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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