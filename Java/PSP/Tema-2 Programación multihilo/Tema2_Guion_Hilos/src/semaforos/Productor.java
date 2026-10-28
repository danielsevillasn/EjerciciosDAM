package semaforos;

//Hilo productor. Llama al metodo del monitor que genera una nueva entrada
//Bucle infinito, termina con la llegada de una interrupcion
public class Productor implements Runnable {

	Monitor miMon;
	String sNom;

	public Productor(Monitor mon, String nombre) {
		miMon = mon;
		sNom = nombre;
	}

	@Override
	public void run() {
		// Bucle infinito, sale por el catch por la llegada de una interrupcion
		while (true) {
			System.out.println("Entra Producir " + sNom);
			
			miMon.Producir();
			try {
				Thread.sleep(3000 + (int) (Math.random() * 5000));
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("Terminando productor " + sNom);
	}
}