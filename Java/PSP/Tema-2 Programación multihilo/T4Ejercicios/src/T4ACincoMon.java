
public class T4ACincoMon {
	int iNumTQueso = 0;
	int iNumTLimon = 0;
	int iNumTFresa = 0;
	int iNumTotal = 0;
	
	boolean bTerminaPQueso = false;
	boolean bTerminaPLimon = false;
	boolean bTerminaPFresa = false;
	
	boolean bConcinerosFin = false;
	
	public synchronized void HacerTarta (String sTipo)
	{
		int iNumTartas;
		
		while( (sTipo.equals("queso") && (iNumTQueso == 2)) || (sTipo.equals("limon") && (iNumTLimon == 2))   || (sTipo.equals("fresa") && (iNumTFresa == 2)) || (iNumTotal == 5)  )
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(sTipo.equals("queso"))
		{
			iNumTQueso++;
			iNumTartas =  iNumTQueso;
		}
		else if(sTipo.equals("limon"))
		{
			iNumTLimon++;
			iNumTartas =  iNumTLimon;
		}
		else
		{
			iNumTFresa++;
			iNumTartas =  iNumTFresa;
		}
		iNumTotal++;
		
		System.out.println("Disponibles " + iNumTartas + " de " + sTipo + ". Total de todos los tipos: " + iNumTotal);
		
		notifyAll();
	}
	       
	public synchronized void ComerTarta (String sTipo)
	{
		while( (sTipo.equals("queso") && (iNumTQueso == 0)) || (sTipo.equals("limon") && (iNumTLimon == 0))   || (sTipo.equals("fresa") && (iNumTFresa == 0)))
		{
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		
		if(sTipo.equals("queso"))
		{
			iNumTQueso--;
		}
		else if(sTipo.equals("limon"))
		{
			iNumTLimon--;
		}
		else
		{
			iNumTFresa--;
		}

		iNumTotal--;
		
		notifyAll();
	}
}
