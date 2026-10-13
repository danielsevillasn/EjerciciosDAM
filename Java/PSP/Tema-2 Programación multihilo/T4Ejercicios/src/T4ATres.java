
public class T4ATres {
	static final int NUMFABPATAS = 4;
	static final int NUMFABTAB = 2;
	static final int NUMENSAM = 2;
	
	public static void main (String [] args)
	{
		T4ATresMon mon = new T4ATresMon();
		T4ATresPatas [] consPat = new T4ATresPatas [NUMFABPATAS];
		T4ATresTablero [] consTab = new T4ATresTablero[NUMFABTAB];
		T4ATresEnsambla [] ensambla = new T4ATresEnsambla[NUMENSAM];
		
		for (int i=0; i < NUMFABPATAS; i++)
		{
			consPat[i] = new T4ATresPatas((i+1),mon);
			consPat[i].start();
		}

		for (int i=0; i < NUMFABTAB; i++)
		{
			consTab[i] = new T4ATresTablero((i+1),mon);
			consTab[i].start();
		}

		for (int i=0; i < NUMENSAM; i++)
		{
			ensambla[i] = new T4ATresEnsambla((i+1),mon);
			ensambla[i].start();
		}
		
		// **********************************************************
		for (int i=0; i < NUMFABPATAS; i++)
		{
			try {
				consPat[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i=0; i < NUMFABTAB; i++)
		{
			try {
				consTab[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Ya han terminado todos los fabricantes de patas y tableros. Activamos para que tambien terminen ensambladores
		mon.bTerminaPatyTab = true;

		for (int i=0; i < NUMENSAM; i++)
		{
			ensambla[i].interrupt();
		}
	}
}
