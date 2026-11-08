
public class T3ACincoLadron extends Thread {
	// Aunque no lo dice el enunciado ponemos un tiempo al robo de lingotes
	// Para que no sea un unico hilo el que robe todos cuando tenga tiempo de procesamiento
	
	T3ACincoM mon;
	int iLadron;
	
	public T3ACincoLadron (int iLadron, T3ACincoM mon)
	{
		this.mon = mon;
		this.iLadron = iLadron;
	}
	
	@Override
	public void run ()
	{
		while(true)
		{
			int iTiempo = ((int)(Math.random() * 3) * 100);
			try {
				Thread.sleep(iTiempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int iNumLinRob = (int)((Math.random() * 5) + 1);
			
			if (mon.iNumLingotes >= iNumLinRob)
			{
				mon.iNumLingotes = mon.iNumLingotes - iNumLinRob;
				mon.iLinLadron[iLadron] = mon.iLinLadron[iLadron] + iNumLinRob;
			}
			else
			{
				mon.iLinLadron[iLadron] = mon.iLinLadron[iLadron] + mon.iNumLingotes;
				mon.iNumLingotes = 0;
			}
			
			if(mon.iNumLingotes == 0)
			{
				break;
			}
		}
	}
}
