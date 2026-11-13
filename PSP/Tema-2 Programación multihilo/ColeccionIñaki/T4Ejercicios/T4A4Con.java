
public class T4A4Con extends Thread {
	int iNumCochesCom = 0;
	int iTipoCoche;
	T4A4Mon mon;
	
	public T4A4Con (int iTipo, T4A4Mon mon) 
	{
		iTipoCoche = iTipo;
		this.mon = mon;
	}
	
	@Override
	public void run()
	{
		while(! mon.bFinalProd)
		{
			mon.Compro(iTipoCoche);
			iNumCochesCom++;
		}
	}
}
