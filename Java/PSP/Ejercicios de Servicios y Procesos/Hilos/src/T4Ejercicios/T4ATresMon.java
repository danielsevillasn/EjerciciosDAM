
public class T4ATresMon {
	int iNumPatas = 0;
	int iNumTab = 0;
	final int MAXNUMPATAS = 10;
	final int MAXNUMTABLEROS = 6;
	boolean bTerminaPatyTab = false;
	
	public T4ATresMon ()
	{
	}
	
	public synchronized void AnadirPata ()
	{
		while(iNumPatas >= MAXNUMPATAS)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		notifyAll();
		iNumPatas ++;

	}

	public synchronized void AnadirTablero ()
	{
		while(iNumTab >= MAXNUMTABLEROS)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		notifyAll();
		iNumTab ++;
	}
	
	
	public synchronized void Ensambla ()
	{
		while((iNumTab == 0) || iNumPatas < 4)
		{
			try {
				wait();
			} catch (InterruptedException e) {						// Interrumpido mientras duerme. Porque han terminado fabricantes de patas y tableros
				e.printStackTrace();
				break;
			}
		}

		notifyAll();
		if(! bTerminaPatyTab) {
			iNumTab--;
			iNumPatas = iNumPatas - 4;
		}
	}
}
