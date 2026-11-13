
public class T4A4Mon {
	int iTipoCoche;
	boolean bFinalProd = false;
	
	public synchronized void Compro (int iMiTipo)
	{
		while(iTipoCoche != iMiTipo)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		
		if(!bFinalProd)
		{
			// System.out.println("Consumidor " + iTipoCoche + " comprueba " + iMiTipo);
			iTipoCoche = 0;
		}
		notifyAll();
	}
	
	public synchronized void Construyo()
	{	while(iTipoCoche != 0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		iTipoCoche = (int)(Math.random() * 5) + 1;
		notifyAll();
	}
}
