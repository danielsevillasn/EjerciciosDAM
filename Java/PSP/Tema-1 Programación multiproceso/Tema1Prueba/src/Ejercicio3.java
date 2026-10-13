import java.io.File;
import java.io.IOException;

public class Ejercicio3 {
	public static void main(String[] args) {
		String[] sArg = new String[2];
		sArg[0] = "/usr/java/jdk-24.0.2/bin/java"; // Consultar localizacion con which java
		sArg[1] = "ProcesoHijo2"; // .class, sin indicar
		ProcessBuilder mipb = null;
		Process miProc = null;
		miProc = null;
		mipb = new ProcessBuilder(sArg);
		mipb.directory(new File("./bin"));
		try {
			miProc = mipb.start(); // Inicia el proceso
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(miProc.pid()); // Pid del proceso iniciado
		int iSalida = 111;
		boolean bSalida = false;
		try {
			iSalida = miProc.waitFor();
		// bSalida = miProc.waitFor(1, TimeUnit.SECONDS);
		// bSalida = miProc.waitFor(4, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (bSalida) // Si ha terminado pido el valor de retorno. Sino da excepcion
		{
			iSalida = miProc.exitValue();
		}
	// System.out.println(bSalida);
		System.out.println(iSalida);
	}
}