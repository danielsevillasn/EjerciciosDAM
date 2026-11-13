
// Monitor sin exclusion mutua
public class T2CuatroM {
	int iPos = 0;
	String [] sClas;
	int iNumCorr;
	
	public T2CuatroM (int iNumC)
	{
		iNumCorr = iNumC;
		sClas = new String[iNumC];
	}
	
	public void addEntrada(int iEn)
	{
		sClas[iPos] = "Posicion: " + (iPos + 1) + ". Corredor: " + iEn;
		iPos++;
	}
	
	public void muestra()
	{
		 for (int iCorr = 0; iCorr < iNumCorr; iCorr++)
		 {
			 System.out.println(sClas[iCorr]);
		 }
	}
}
