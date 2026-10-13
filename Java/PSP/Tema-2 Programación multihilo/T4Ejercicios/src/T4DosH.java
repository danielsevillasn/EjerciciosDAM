
public class T4DosH extends Thread {
	T4DosM mon;
	
	public T4DosH(T4DosM mon)
	{
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		for(int i=0;i<150;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			mon.PonerBarra();
		}

	}
}
