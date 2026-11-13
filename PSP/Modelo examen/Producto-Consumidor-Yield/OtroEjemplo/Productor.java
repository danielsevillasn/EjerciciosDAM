package examen;

import javax.management.monitor.Monitor;

public class Productor implements Runnable{
	private static int contadorId = 1;
	private Monitor monitor;
	private String elemento;
	private int idProductor;

	public Productor(Monitor monitor, String elemento) {
		this.monitor = monitor;
		this.elemento = elemento;
		this.idProductor = contadorId++;
	}

	@Override
	public void run() {
		if (elemento == null || elemento.isEmpty()) {
			monitor.registrarIncidencia();
			return;
		}
		monitor.depositarElemento();
		try {
			monitor.depositar(elemento, idProductor);
		} catch (InterruptedException e) {
			System.out.println("El productor " + idProductor + " lleva demasiado tiempo esperando");
		}
	}
	
}
