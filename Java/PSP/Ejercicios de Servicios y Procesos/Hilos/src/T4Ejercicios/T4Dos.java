
public class T4Dos {
	static T4DosM mon = new T4DosM ();
	
	public static void main (String [] args)
	{
		T4DosH panadero = new T4DosH (mon);
		T4DosH panadero2 = new T4DosH (mon);

		T4DosH2 vendedor = new T4DosH2 (mon);
		T4DosH2 vendedor2 = new T4DosH2 (mon);
		T4DosH2 vendedor3 = new T4DosH2 (mon);

		panadero.start();
		panadero2.start();
		vendedor.start();
		vendedor2.start();
		vendedor3.start();
		
		try {
			panadero.join();
			panadero2.join();

			vendedor.join();
			vendedor2.join();
			vendedor3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
