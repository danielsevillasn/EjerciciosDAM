package monitor_Productor_Consumidor;

//Monitor. Array que gestiona el acceso con exclusion mutua al array.
//Utiliza synchronized, wait y notifyall
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Monitor {
	final int REG = 3;
	int iNumAlm = 0;

	// Version 1 -- INI con array
	String miArr[] = new String[REG];
	// Version 1 -- FIN

	// Version 2 -- INI con coleccion
	Set<String> miCol = new TreeSet<String>();
	// Version 2 -- FIN

	public synchronized void Producir() {
		while (iNumAlm == REG) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Anadir fecha al buffer
		LocalDateTime ldt = LocalDateTime.now();

		// Version 1 -- INI con array
			miArr[iNumAlm] = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
			System.out.println("Produce a las " + miArr[iNumAlm]);
		// Version 1 -- FIN

		// Version 2 -- INI con coleccion
//		String sTiempo = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();
//		miCol.add(sTiempo);
//		System.out.println("Produce a " + sTiempo);
		// Version 2 -- FIN

		iNumAlm++;
		notifyAll();
	}

	public synchronized void Consumir() {
		while (iNumAlm == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Leer del buffer
		iNumAlm--;
		// Version 1 -- INI con array
		System.out.println("Consume a las " + miArr[iNumAlm]);
		// Version 1 -- FIN

		// Version 2 -- INI con coleccion
//		Iterator miIter = miCol.iterator();
//		System.out.println("Consume a las " + miIter.next());
//		miIter.remove();
		// Version 2 -- FIN

		notifyAll();
	}
}
