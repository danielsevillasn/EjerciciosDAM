
public class T4ATresTablero extends Thread {

	T4ATresMon mon;
	int iFab;
	int iTiempoTablero;	// El enunciado dice constante, pero hago variable aleatoria
	int iNumTabFab;
	
	public T4ATresTablero (int iFab,T4ATresMon mon)
	{
		this.mon = mon;
		this.iFab = iFab;
		iTiempoTablero = ((int)(Math.random() * 3) + 1) * 1000;	// Entre 1 y 4
	}
	
	@Override
	public void run ()
	{
		while(iNumTabFab < 5) {		// No 10
			try {
				Thread.sleep(iTiempoTablero);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mon.AnadirTablero();
			iNumTabFab++;
			System.out.println("** TABLEROS: " +iFab + ". Llevo " +  iNumTabFab + "\t\tStock(Patas-Tableros): " + mon.iNumPatas + "-" + mon.iNumTab);
		}
	}
}
