
public class T3ACinco {
	static final int NUMLAD = 3;
	
	public static void main (String [] args)
	{
		T3ACincoM mon = new T3ACincoM();
		T3ACincoLadron [] misLad = new T3ACincoLadron[NUMLAD]; 
		
		for (int iNumLad = 0 ; iNumLad< NUMLAD; iNumLad++)
		{
			misLad[iNumLad] = new T3ACincoLadron(iNumLad,mon);
			misLad[iNumLad].start();
		}

		for (int iNumLad = 0 ; iNumLad< NUMLAD; iNumLad++)
		{
			try {
				misLad[iNumLad].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("NOS HAN ROBADO TODO EL ORO .....");

		for (int iNumLad = 0 ; iNumLad< NUMLAD; iNumLad++)
		{
			System.out.println("El ladron " + (iNumLad + 1) + " ha robado " + mon.iLinLadron[iNumLad] + " lingotes");
		}
	}
}
