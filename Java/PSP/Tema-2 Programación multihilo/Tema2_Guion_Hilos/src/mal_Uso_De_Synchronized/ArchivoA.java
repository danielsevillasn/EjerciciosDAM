package mal_Uso_De_Synchronized;

public class ArchivoA {

	/**
	 * ****************************************************************************
	 * métodoA: simula el acceso al recurso ArchivoA con exclusión mutua. Duerme al
	 * hilo y después invoca al método que le permitirá o intentará el acceso a
	 * ArchivoB
	 *
	 * @param b: ArchivoB
	 */
	public synchronized void metodoA(ArchivoB b) {

		String name = Thread.currentThread().getName(); // imprime en la salida
														// el nombre del hilo que
														// ejecuta el método
		System.out.println("Hilo " + name + " entra en ArchivoA");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Excepción: " + e.getMessage());
		}

		System.out.println("Hilo " + name + " intentando acceder a fichero_B");
		b.metodoB(this);
	}

	public synchronized void syn2() {

		System.out.println("Dentro de A.syn2");
	}
}