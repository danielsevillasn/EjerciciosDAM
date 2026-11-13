
public class T5ACuatroFilosofo  extends Thread {
	T5ACuatroMon mon;		// Monitor para gestion de paillos
	int iIden;				// Identificador del filosofo
	boolean bActivo = true;	// Vivo hasta que sea false
	
	public T5ACuatroFilosofo(int i, T5ACuatroMon mon)
	{
		iIden = i;
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		while(bActivo)		// Hasta que termine por interrupt desde el padre
		{
			int iAle;	

			try {
				// Piensa entre 100 y 200 mseg
				iAle = (int)(Math.random() * 100) + 100;
				Thread.sleep(iAle);
		
				// Coge palillos
				mon.CogerPalillo(iIden);
			
				// Come entre 500 y 3000 mseg
				iAle = (int)(Math.random() * 500) + 2500;	
				Thread.sleep(iAle);
		
				// Devuelve palillos
				mon.DevPalillo(iIden);

				// Piensa entre 100 y 200 mseg
				iAle = (int)(Math.random() * 100) + 100;	
				Thread.sleep(iAle);

			} catch (InterruptedException e) {
				e.printStackTrace();
				bActivo = false;				// Finaliza al recibir interrupcion del padre
			}
		}
	}
}
