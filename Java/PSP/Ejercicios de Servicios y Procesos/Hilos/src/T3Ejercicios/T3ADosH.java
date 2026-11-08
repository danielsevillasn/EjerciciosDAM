
public class T3ADosH extends Thread {
	String sNom;
	T3ADosM mon;
	
	public T3ADosH(String sNom, T3ADosM mon)
	{
		this.sNom = sNom;
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		while (mon.iSaldo > 0)
		{
			mon.SacarDinero(sNom);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
