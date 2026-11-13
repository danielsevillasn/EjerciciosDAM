
public class T5ACuatro {
	public static void main (String [] args)
	{
		T5ACuatroMon mon = new T5ACuatroMon();
		T5ACuatroFilosofo [] arrFil = new T5ACuatroFilosofo[mon.NUMFIL];
		
		for (int i=0;i<mon.NUMFIL;i++)
		{
			arrFil[i] = new T5ACuatroFilosofo(i,mon);
			arrFil[i].start();
		}

		// Margen para que ejecuten un tiempo
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Termina los filosofos
		for (int i=0;i<mon.NUMFIL;i++)
		{
			arrFil[i].interrupt();
		}

	}
}
