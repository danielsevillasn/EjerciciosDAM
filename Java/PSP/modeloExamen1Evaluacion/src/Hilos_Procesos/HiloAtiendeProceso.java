import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

// Por cada proceso lanzado se crea una instancia de esta clase (hilo)
public class HiloAtiendeProceso extends Thread {
	Process miPro = null;	// Referencia al proceso que tiene que atender
	Monitor miMon;			// Referencia a la clase Monitor donde todos los hilos almacenan los nombres leidos del fichero
	
	// Constructor que guarda en variables de clase. La referencia al proceso y al monitor
	public HiloAtiendeProceso (Process miPro,Monitor miMon)
	{
		this.miPro = miPro;
		this.miMon = miMon;
	}
	
	// El metodo run va leyendo la informacion recibida desde el proceso y guardandola en el monitor
	public  void run()
	{
		InputStream inS = miPro.getInputStream();
		
		// Enlazar salida estandar del proceso hijo con este proceso padre
		InputStreamReader miIsr = new InputStreamReader(inS);
		BufferedReader miIsrb = new BufferedReader(miIsr);

		String sInfo = "";
		try {
			while(true)							// Bucle infinito que finaliza al recibir FIN del proceso
			{
				sInfo = miIsrb.readLine();
				// System.out.println(sInfo);
				if (! sInfo.equals("FIN"))
				{
					miMon.incNombreArrL(sInfo);	// Anade al ArrayList disponible en el monitor el nuevo nombre recibido	
				}
				else
				{
					break;						// Break para salir del bucle infinito y de esta forma terminar el hilo
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
