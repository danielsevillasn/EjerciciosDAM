import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Proceso lanzado desde la clase Lanzador.
// Debe leer los nombres que tiene un archivo y enviarlos al proceso padre.
// El nombre del fichero que debe leer lo recibe como parametro de entrada args[0]
public class EjerCompleto2 {
	public static void main (String [] args)
	{
		// Leer el fichero que tiene la info de los procesos a lanzar
		File archivo = new File (args[0]);
		FileReader fr;
		try {
			fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		
		// Mientras haya entradas que leer
		while ((linea = br.readLine()) != null)
			{	
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Se ha definido un interfaz de comunicacion entre aplicaciones en el que el mensaje FIN indica a la aplicacion
		// padre que ya ha finalizado el envio de nombres y por tanto el proceso va a terminar
		// Enviada toda la info del fichero
		System.out.println("FIN");
		
		// Deja un segundo de margen al proceso padre para que termine sus tareas antes de finalizar.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
