import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lanzador {

	// Crear el monitor. Tiene informacion de la seccion critica. Lista de nombres recibidos de los procesos
	static Monitor miMon = new Monitor();
	// Array list creado para almacenar los hilos lanzados y asi luego poder hacer su join
	static ArrayList <HiloAtiendeProceso> misHilos = new ArrayList <HiloAtiendeProceso>(); 
	
	public static void main (String []args)
	{
		// Nombre por defecto del archivo con fichero con procesos. Se considera si no se mete ninguno por parametro
		String sFile = "archivo.txt";		 
		if (args.length > 0)
		{
			sFile = args[0];
		}

		// Validar si el fichero de procesos existe
		File fichero = new File(sFile);
        if (fichero.exists()) {
        } else {
            System.out.println("El fichero " + sFile + " no existe");
            System.exit(0);
        }
		
		//*** Leer el fichero que tiene la info de los procesos a lanzar  ****
		File archivo = new File (sFile);
		FileReader fr;
		try {
			fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
		
			// Mientras haya entradas en el fichero de procesos
			while ((linea = br.readLine()) != null)
			{	
				// Cada entrada leida tiene como formato: nombre_proceso_lanzar nombre_fichero_que_tiene_que_procesar
				// System.out.println(linea);
				String [] sInfo = linea.split(" ");
				// Por cada entrada del registro lanza un proceso y un hilo que atiende
				LanzarProceso (sInfo[0], sInfo[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// join a todos los hilos para continuar. Momento en el que han terminado todos los procesos y por tanto todos los hilos
		// Los hilos terminan al recibir de su proceso asociado FIN. Los procesos envian FIN justo antes de terminar
		// HiloAtiendeProceso es un arrayList que tiene una referencia a los hilos lanzados. Se va completando en el metodo LanzarProceso 
		for(HiloAtiendeProceso a: misHilos)			
		{
			try {
				a.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Aqui se han cumplido todos los join. Por tantos todos los hilos han terminado porque han terminado a su vez  todos los procesos
		//System.out.println("Terminados todos los hilos.");
		
		// Mostrar por pantalla los nombres que se han ido recibiendo de todos los procesos.
		mostrarInfoPant();
	}
	
	// Muestra por pantalla los resultados del ejercicio
	public static void mostrarInfoPant()
	{
		// Recupera una referencia al arrayList de nombres que se ha rellenado en la clase Monitor desde los hilos
		ArrayList <String> arrLNombres = miMon.obtArrL();
		
		System.out.println("\n\tNombres recibidos desde los procesos\n");
		
		for(String sNombre: arrLNombres)
		{
			System.out.println("\t\t* " +sNombre);
		}

		System.out.println("\n\tFin del programa");
	}
	
	// Lanzar el proceso sProceso, indicando el fichero sFichero como argumento
	// Cada proceso lanzado sera atendido por un hilo
	public static void LanzarProceso(String sProceso, String sFichero)
	{
		String [] sArg = new String [3];
		sArg[0] = "/usr/java/jdk-24.0.2/bin/java";	// Consultar localizacion con which java
		// sArg[1] = "EjerCompleto2";					// .class, sin indicar
		 sArg[1] = sProceso;					// .class, sin indicar
		 sArg[2] = sFichero;					// .class, sin indicar

		ProcessBuilder mipb = null;
		
		mipb = new ProcessBuilder(sArg);
		mipb.directory(new File("./bin"));
		
		Process miProc;
		
		try {
			miProc = mipb.start();	// Inicia el proceso
			
			// Crear un hilo que atienda los inputStream y outputStram
			HiloAtiendeProceso miHilo = new HiloAtiendeProceso(miProc,miMon);
			miHilo.start();
			misHilos.add(miHilo);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(miProc.pid());	// Pid del proceso iniciado
	}
}
