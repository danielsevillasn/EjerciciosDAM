
public class T4ACincoZampon extends Thread {
	String sNombre;
	T4ACincoMon mon;
	String sTipoTarta;
	
	public T4ACincoZampon (String sNombre, T4ACincoMon mon, String sTipo) 
	{
		this.sNombre = sNombre;
		this.mon = mon;
		this.sTipoTarta = sTipo;
	}
	
	@Override
	public void run ()
	{
		while(! mon.bConcinerosFin)
		{
			try {
				Thread.sleep(300 + (int)(Math.random() * 300));
			} catch (InterruptedException e) {
				// e.printStackTrace();
				break;
			}
			
			mon.ComerTarta (sTipoTarta);
			if(! mon.bConcinerosFin)
			{
				System.out.println(sNombre + " se ha comindo una tarta de " + sTipoTarta);
			}
		}
	}
}
