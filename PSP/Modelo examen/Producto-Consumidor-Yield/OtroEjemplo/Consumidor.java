package examen;

public class Consumidor implements Runnable{
	private Monitor monitor;
	private int idConsumidor;

	public Consumidor(Monitor monitor, int idConsumidor) {
		this.monitor = monitor;
		this.idConsumidor = idConsumidor;
	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				monitor.retirar(idConsumidor);
				monitor.sacarElemento();
				Thread.yield();
			}
		} catch (InterruptedException e) {
			System.out.println("El consumidor " + idConsumidor + " ha finalizado la espera.");
		}
	}
}
