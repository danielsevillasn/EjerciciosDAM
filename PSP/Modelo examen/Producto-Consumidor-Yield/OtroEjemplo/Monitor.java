package examen;

import java.util.ArrayList;
import java.util.List;

public class Monitor {
	private int capacidadMaxima;
	private int nElementosAlmacen;
	private List<String> elementosAlmacenList;

	private int elementosDepositados = 0;
	private int elementosSacados = 0;
	private int incidendiasRegistradas = 0;
	private boolean contenidoVacio = true;

	public Monitor(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		elementosAlmacenList = new ArrayList<>();
		nElementosAlmacen = 0;
	}

	public synchronized void depositarElemento() {
		elementosDepositados++;
	}

	public synchronized void sacarElemento() {
		elementosSacados++;
	}

	public synchronized void registrarIncidencia() {
		incidendiasRegistradas++;
	}

	private void comprobarContenidoAlmacen() {
		contenidoVacio = elementosAlmacenList.isEmpty();
	}

	public synchronized void depositar(String elemento, int idProductor) throws InterruptedException {
		while (nElementosAlmacen == capacidadMaxima) {
			System.out.println("El productor " + idProductor + " no puede depositar ya que el almacen esta lleno");
			wait();
		}

		elementosAlmacenList.add(elemento);
		this.nElementosAlmacen = elementosAlmacenList.size();
		comprobarContenidoAlmacen();

		notifyAll();

		System.out.println("El productor " + idProductor + " acaba de depositar un elemento, numero de elementos en el almacen: " + nElementosAlmacen);
	}

	public synchronized void retirar(int idConsumidor) throws InterruptedException {
		comprobarContenidoAlmacen();
		while (nElementosAlmacen == 0 || contenidoVacio) {
			System.out.println("El consumidor " + idConsumidor + " no puede retirar ya que el almacen esta vacio");
			wait();
			comprobarContenidoAlmacen();
		}

		String elementoASacar = elementosAlmacenList.get(elementosAlmacenList.size() - 1);
		elementosAlmacenList.remove(elementosAlmacenList.size() - 1);
		this.nElementosAlmacen = elementosAlmacenList.size();
		comprobarContenidoAlmacen();

		notifyAll();
		System.out.println("El consumidor " + idConsumidor + " acaba de retirar un elemento llamado: " + elementoASacar + ", numero de elementos en el almacen: " + nElementosAlmacen);
	}

	public void getResultados() {
		System.out.println("\n--- RESULTADOS ---");
		System.out.println("Elementos depositados: " + elementosDepositados);
		System.out.println("Elementos sacados: " + elementosSacados);
		System.out.println("Incidencias registradas: " + incidendiasRegistradas);
	}
	
}
