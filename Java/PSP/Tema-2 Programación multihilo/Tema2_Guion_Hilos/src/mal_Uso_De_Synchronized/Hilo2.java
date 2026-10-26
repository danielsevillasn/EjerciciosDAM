package mal_Uso_De_Synchronized;

public class Hilo2 extends Thread {

	ArchivoA a; // declaración de objetos, uno
	ArchivoB b; // de cada tipo de archivo

	Hilo2(ArchivoA a, ArchivoB b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * *****************************************************************************
	 * Lógica asociada a la ejecución del hilo: capturar el recurso 'ArchivoA'
	 */
	@Override
	public void run() {
		b.metodoB(a); // el hilo captura el recurso 'ArchivoA'
	}
}