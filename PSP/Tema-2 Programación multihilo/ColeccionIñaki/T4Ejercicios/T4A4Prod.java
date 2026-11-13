
public class T4A4Prod extends Thread {
	static int iNumVehCons = 0;
	T4A4Mon mon;
	
	public T4A4Prod(T4A4Mon mon)
	{
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		while(iNumVehCons < 20)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mon.Construyo();
			iNumVehCons++;
			
			System.out.println("Construido un vehiculo del tipo " + mon.iTipoCoche + " . Ya llevo " + iNumVehCons);
		}
		
		mon.bFinalProd = true;
	}
}
