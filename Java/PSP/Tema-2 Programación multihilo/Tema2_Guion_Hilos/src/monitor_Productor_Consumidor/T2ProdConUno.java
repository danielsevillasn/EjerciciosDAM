package monitor_Productor_Consumidor;
import java.util.Scanner;

public class T2ProdConUno {
	Scanner miScan = new Scanner(System.in);

	public static void main(String[] args) {
		Monitor miMon = new Monitor(); // Alta del monitor
		// Crea los cuatro hilos (dos productores, dos consuminodres)
		Productor prodUno = new Productor(miMon, "PROC-1");
		Consumidor conUno = new Consumidor(miMon, "CON-1");
		Productor prodDos = new Productor(miMon, "PROC-2");
		Consumidor conDos = new Consumidor(miMon, "CON-2");
		Thread hiloProdUno = new Thread(prodUno);
		Thread hiloConUno = new Thread(conUno);
		Thread hiloProdDos = new Thread(prodDos);
		Thread hiloConDos = new Thread(conDos);
		// Inicia los hilos.
		hiloProdUno.start();
		hiloConUno.start();
		hiloProdDos.start();
		hiloConDos.start();

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		hiloProdUno.interrupt();
		hiloConUno.interrupt();
		hiloProdDos.interrupt();
		hiloConDos.interrupt();
	}
}
