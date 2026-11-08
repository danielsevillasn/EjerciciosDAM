import java.util.ArrayList;

// Espacio destinado para guardar las variables que tienen acceso simultaneo desde diferentes hilos
public class Monitor {
	// ArrayList de nombres recibidos desde los procesos. Se almacenan desde los hilos de forma concurrente
	private ArrayList <String> arrLNombres = new ArrayList <String>();
	
	// Anade un nombre al arrayList. Se hace synchronized para evitar colisiones de acceso entre hilos
	public synchronized void  incNombreArrL (String sNombre)
	{
		arrLNombres.add(sNombre);
	}
	
	// Devuelve la referencia al arrayList de nombres
	public ArrayList <String> obtArrL()
	{
		return arrLNombres;
	}
}
