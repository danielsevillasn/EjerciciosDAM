package mal_Uso_De_Synchronized;

public class Main {

	static ArchivoA a = new ArchivoA(); // Se crean dos recursos de tipo "Archivo",
	static ArchivoB b = new ArchivoB(); // uno de cada tipo, o sea "Archivo A" y "Archivo B"

	public static void main(String args[]) {

		Hilo1 hilo1 = new Hilo1(a, b); // creación de hilos que serán los
		Hilo2 hilo2 = new Hilo2(a, b); // responsables del interbloqueo

		hilo1.start(); // ejecución de lógica que invoca métodos
		hilo2.start(); // del tipo 'synchronized'
	}
}
