
public class T2ASeisTren implements Runnable {

	final int NUMTRA = 5;
	long lTimeParMax = Long.MIN_VALUE;
	int iMaxTra = 0;
	T2ASeisMonitor miMon;
	int iNumTren;
	long lTimeIni;
	long lTimeFin;
	long lTimeAnt;

	
	public T2ASeisTren(T2ASeisMonitor mon, int iNumTren) 
	{
		miMon = mon;
		this.iNumTren = iNumTren + 1;
	}

	@Override
	public void run() {
		lTimeIni = System.currentTimeMillis();
		lTimeAnt = lTimeIni;
		for (int i = 0;i<NUMTRA;i++)
		{
			int iMilRan = ((int)(Math.random() * 5)) * 100;
			try {
				Thread.sleep(300 + iMilRan);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			long lTimeAux = System.currentTimeMillis();
			System.out.println("El tren " + iNumTren + " ha completado el trayecto " + (i + 1) + " realizado en: " + (lTimeAux - lTimeAnt) + " mseg");
			if((lTimeAux - lTimeAnt) > lTimeParMax)
			{
				lTimeParMax = lTimeAux - lTimeAnt;
				iMaxTra = i + 1;
			}
			lTimeAnt = lTimeAux;
		}
	
		lTimeFin = System.currentTimeMillis();
		miMon.lTimepoTotal = miMon.lTimepoTotal + (lTimeFin - lTimeIni);
		 
		System.out.println("Soy el tren " + iNumTren + ". La parada donde he estado mas tiempo parado es: " + iMaxTra + " durante: " + lTimeParMax + " mseg");
		System.out.println("He tardado " + (lTimeFin - lTimeIni) + " mseg");
	}
}
