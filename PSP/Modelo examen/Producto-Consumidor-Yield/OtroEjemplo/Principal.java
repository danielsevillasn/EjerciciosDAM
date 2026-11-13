package examen;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> elementosAlmacen = new ArrayList<>();
		elementosAlmacen.add("Manzana");
		elementosAlmacen.add("");
		elementosAlmacen.add("Caja");
		elementosAlmacen.add("Pera");
		elementosAlmacen.add("");
		elementosAlmacen.add("Martillo");

		Monitor monitor = new Monitor(2);

		ArrayList<Thread> productoresArrayList = new ArrayList<>();
		for (String elemento : elementosAlmacen) {
			Thread hiloProductor = new Thread(new Productor(monitor, elemento));
			productoresArrayList.add(hiloProductor);
			hiloProductor.start();
		}

		ArrayList<Thread> consumidoresArrayList = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			Thread hiloConsumidor = new Thread(new Consumidor(monitor, i));
			consumidoresArrayList.add(hiloConsumidor);
			hiloConsumidor.start();
		}

		// Esperar a que todos los productores terminen su trabajo
		for (Thread productor : productoresArrayList) {
			try {
				productor.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Tiempo de margen para procesar los elementos restantes en el monitor
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Interrumpir consumidores para salir del bucle continuo
		for (Thread consumidor : consumidoresArrayList) {
			consumidor.interrupt();
		}

		for (Thread consumidor : consumidoresArrayList) {
			try {
				consumidor.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Mostrar resumen final
		monitor.getResultados();
	}

}
