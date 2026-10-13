
public class T4ATresEnsambla extends Thread {
	T4ATresMon mon;
	int iEn;
	int iTiempoEnsam;	// El enunciado dice constante, pero hago variable aleatoria
	
	public T4ATresEnsambla (int iEn,T4ATresMon mon)
	{
		this.mon = mon;
		this.iEn = iEn;
		iTiempoEnsam = ((int)(Math.random() * 3) + 1) * 1000;	// Entre 1 y 4
	}
	
	@Override
	public void run ()
	{
		while(! mon.bTerminaPatyTab) {
			try {
				Thread.sleep(iTiempoEnsam);
			} catch (InterruptedException e) {					// Interrumpido mientras duerme. Porque han terminado fabricantes de patas y tableros
				e.printStackTrace();
				break;
			}
			
			mon.Ensambla();

			if(! mon.bTerminaPatyTab) {							// Interrumpido mientras modo wait. Porque han terminado fabricantes de patas y tableros
				System.out.println("\n** ENSAMBLADOR: " + iEn + "	Quedan " + mon.iNumPatas + " patas, " +  mon.iNumTab + " tableros.\n" );
			}
		}
		System.out.println("Soy el ensamblador " + iEn + " Finalizando");
	}
}
