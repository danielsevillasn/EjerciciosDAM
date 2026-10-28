 
public class T4ACincoPast extends Thread {
	T4ACincoMon mon;
	String sTipoTarta;
	int iNumTartas = 0;
	int iNumCoc;
	
	public T4ACincoPast (T4ACincoMon mon,String sTipoTarta,int iNumCoc)
	{
		this.mon = mon;
		this.sTipoTarta = sTipoTarta;
		this.iNumCoc = iNumCoc;
	}

	@Override
	public void run ()
	{
		while(iNumTartas < 10)
		{
			try {
				Thread.sleep(200 + (int)(Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mon.HacerTarta (sTipoTarta);
			iNumTartas++;
			
			System.out.println("Cocinero " + iNumCoc + " Ha cocinado " + iNumTartas + " de " + sTipoTarta);
		}	
	}
}
