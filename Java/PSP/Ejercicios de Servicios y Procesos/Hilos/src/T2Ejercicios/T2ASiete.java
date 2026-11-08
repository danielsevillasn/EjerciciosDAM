
public class T2ASiete {
	static final int NUMMOTOS = 5;
	static T2ASieteMon mon = new T2ASieteMon(NUMMOTOS);
	static T2ASieteMoto [] motos = new T2ASieteMoto[NUMMOTOS];
	
	public static void main (String [] args)
	{
		int iSeg = 0;
		
		System.out.println("Carrera con una distancia de: " + ((int)mon.dDistCir));
		for (int i=0;i<NUMMOTOS;i++)
		{
			motos[i] = new T2ASieteMoto(i,mon);
			motos[i].start();
		}
		
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		int iMul = 0;
		
		while(! mon.getbCarrTer())
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			iMul++;
			
			if(iMul == 100)
			{
				System.out.println("");
				iSeg++;
				System.out.print("Tiempo: " + iSeg + " seg -\t");
			
				for (int i=0;i<NUMMOTOS;i++)
				{
					System.out.print("Moto " + (i+1) + ": " + ((int)mon.dDistMoto[i]) + "\t");
				}	
				iMul = 0;
			}
		}	
		
		System.out.println("\n\nFinal de carrera.");
		for (int i=0;i<NUMMOTOS;i++)
		{
			System.out.print("Moto " + (i+1) + ": " + ((int)mon.dDistMoto[i]) + "\t");
		}	
	}
}
