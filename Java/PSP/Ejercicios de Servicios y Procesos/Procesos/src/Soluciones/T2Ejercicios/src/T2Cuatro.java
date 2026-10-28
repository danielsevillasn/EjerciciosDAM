
public class T2Cuatro {
	static final int NUMCORR = 8;
	static T2CuatroH [] arrCorr = new T2CuatroH[NUMCORR];
	static Thread [] arrCorrT = new Thread[NUMCORR];
	static T2CuatroM miMon;
	
	public static void main (String [] args)
	{
		miMon = new  T2CuatroM(NUMCORR);
		
		 for (int iCorr = 0; iCorr < NUMCORR; iCorr++)
		 {
			 arrCorr[iCorr] = new T2CuatroH(iCorr + 1,miMon);
			 arrCorrT[iCorr] = new Thread(arrCorr[iCorr]);
			 arrCorrT[iCorr].start();
		 }

		 for (int iCorr = 0; iCorr < NUMCORR; iCorr++)
		 {
			 try {
				arrCorrT[iCorr].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }

		 System.out.println("Resultado final");
		 miMon.muestra();
	}
}
