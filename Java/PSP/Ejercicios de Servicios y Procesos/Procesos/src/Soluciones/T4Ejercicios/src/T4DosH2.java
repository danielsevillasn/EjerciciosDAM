
public class T4DosH2 extends Thread {
	T4DosM mon;
	
	public T4DosH2(T4DosM mon)
	{
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(50);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			mon.SacarBarra();
		}
	}	
}
