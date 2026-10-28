
public class T2AOchoH extends Thread {
	
	int iNumCoc;
	T2AOchoM mon;
	
	public T2AOchoH (int i, T2AOchoM mon)
	{
		iNumCoc = i;
		this.mon = mon;
	}
	
	@Override
	public void run()
	{
		long lTIni = System.currentTimeMillis();
				
		for(int i=0;i<10;i++)
		{
			// Tarda entre 1 y 4 segundos en hacer la tarta
			int iTiempo = 1 + (int)(Math.random() * 3);
			try {
				Thread.sleep(iTiempo * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Cocinero " + (iNumCoc + 1) + " ha finalizado la tata " + (i+1));
		}
	
		long lTFin = System.currentTimeMillis();
		mon.lTiempoCoc[iNumCoc] = lTFin - lTIni;
	}
}
 