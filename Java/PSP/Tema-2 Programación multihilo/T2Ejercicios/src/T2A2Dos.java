
public class T2A2Dos {
	public static void main(String [] args)
	{
		T2ADosH hiloUno = new T2ADosH(1);
		T2ADosH hiloDos = new T2ADosH(2);
		T2ADosH hiloTres = new T2ADosH(3);

		long lMilIni = System.currentTimeMillis();

		hiloUno.start();
		hiloDos.start();
		hiloTres.start();
		
		try {
			hiloUno.join();
			hiloDos.join();
			hiloTres.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long lMilFin = System.currentTimeMillis();
		long lTiempo = lMilFin - lMilIni;
		
		System.out.println ("Inicio en milisegundos: " + lMilIni);
		System.out.println ("Final en milisegundos: " + lMilFin);
		System.out.println ("Tiempo en milisegundos: " + lTiempo);

	}
}
