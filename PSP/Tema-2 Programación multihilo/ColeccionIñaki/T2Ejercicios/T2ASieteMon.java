
public class T2ASieteMon {
	double dDistCir;	// Distancia del circuito de 5000 a 10000 sin considera unidades
	boolean bFinal = false;
	int iNumeroMotos;
	double [] dDistMoto;
	private boolean bCarrTer = false;
	
	public T2ASieteMon(int iNumMotos)
	{
		dDistCir = 20 + ((int) (Math.random() * 30));
		iNumeroMotos = iNumMotos;
		dDistMoto = new double[iNumeroMotos];
	}
	
	void setbCarrTer(boolean bVal)
	{
		bCarrTer = bVal;
	}

	boolean getbCarrTer()
	{
		return bCarrTer;
	}
	
}
