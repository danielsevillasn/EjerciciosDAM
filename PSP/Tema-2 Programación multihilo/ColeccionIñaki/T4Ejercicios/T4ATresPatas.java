
public class T4ATresPatas extends Thread {

	T4ATresMon mon;
	int iFab;
	int iTiempoPatas;	// El enunciado dice constante, pero hago variable aleatoria
	int iNumPatasFab;
	
	public T4ATresPatas (int iFab,T4ATresMon mon)
	{
		this.mon = mon;
		this.iFab = iFab;
		iTiempoPatas = ((int)(Math.random() * 3) + 1) * 1000;	// Entre 1 y 4
		int iNumPatasFab = 0;
	}
	
	@Override
	public void run ()
	{
		while(iNumPatasFab < 10) {				// No 20
			try {
				Thread.sleep(iTiempoPatas);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			mon.AnadirPata();
			iNumPatasFab++;
			System.out.println("** PATAS: " +iFab + ". Llevo " +  iNumPatasFab + "\t\tStock(Patas-Tableros): " + mon.iNumPatas + "-" + mon.iNumTab);
		}
	}
}
