import java.io.File;
import java.io.IOException;

public class Ejercicio5 {
	public static void main (String [] args)
	{
		String [] sArg = new String [2];
		sArg[0] = "/usr/java/jdk-24.0.2/bin/java";	// Consultar localizacion con which java
		sArg[1] = "ProcesoHijo4";					// .class, sin indicar
		ProcessBuilder mipb = null;
		Process miProc = null;
		
		mipb = new ProcessBuilder(sArg);
		mipb.directory(new File("./bin"));
		
		File fInp = new File("numero.txt");
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		mipb.redirectInput(fInp);
		mipb.redirectOutput(fOut);
		mipb.redirectError(fErr);
		
		try {
			miProc = mipb.start();	// Inicia el proceso
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(miProc.pid());	// Pid del proceso iniciado
	}
}