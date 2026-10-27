package mal_Uso_De_Synchronized;

public class Hilo1 extends Thread {
	ArchivoA a; // declaración de objetos, uno
	ArchivoB b; // de cada tipo de archivo

	Hilo1(ArchivoA a, ArchivoB b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * *****************************************************************************
	 * Lógica asociada a la ejecución del hilo: capturar el recurso 'ArchivoA'
	 */
	@Override
	public void run() {
		a.metodoA(b); // el hilo captura el recurso 'ArchivoA'
	}
}