package semaforos;

//Monitor. Utiliza semaforo
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;

public class Monitor {
	final int REG = 3;
	Semaphore almacen = new Semaphore(REG, true);

	int iNumAlm = 0;
	Set<String> miCol = new TreeSet<String>();

	public synchronized void Producir() {
		try {
			almacen.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Anadir fecha al buffer
		LocalDateTime ldt = LocalDateTime.now();

		String sTiempo = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
		miCol.add(sTiempo);
		System.out.println("Produce a las " + sTiempo);

		iNumAlm++;
		almacen.release();
	}

	public synchronized void Consumir() {
		try {
			almacen.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!miCol.isEmpty()) {
			// Leer del buffer
			iNumAlm--;
			Iterator miIter = miCol.iterator();
			System.out.println("Consume a las " + miIter.next());
			miIter.remove();
		}
		almacen.release();
	}
}