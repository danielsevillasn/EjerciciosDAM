package semaforos;

//Hilo consumidor. Llama al metodo del monitor que gasta una entrada de las existentes
//Bucle infinito, termina con la llegada de una interrupcion
public class Consumidor implements Runnable {

	Monitor miMon;
	String sNom;

	public Consumidor(Monitor mon, String nombre) {
		miMon = mon;
		sNom = nombre;
	}

	@Override
	public void run() {
		// Bucle infinito, sale por el catch por la llegada de una interrupcion
		while (true) {
			System.out.println("Entra Consumir " + sNom);

			miMon.Consumir();
			try {
				Thread.sleep(3000 + (int) (Math.random() * 5000));
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("Terminando consumidor " + sNom);
	}
}