
public class T2CincoEquipo {
	static final int NUMCORR = 4;
	static T2CincoCorredor [] misCorr = new T2CincoCorredor [NUMCORR];

	public static void main (String [] args)
	{
		for(int iCorr=0; iCorr<NUMCORR;iCorr++)
		{
			misCorr[iCorr] = new T2CincoCorredor(iCorr + 1, args[0]);
			misCorr[iCorr].start();
			try {
				misCorr[iCorr].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long lTime = System.currentTimeMillis();
			System.out.println("Equipo " + args[0] + ". Corredor " + (iCorr + 1) + " termina vuelta" +  " en milisegundo " + lTime);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			}
	}
}
