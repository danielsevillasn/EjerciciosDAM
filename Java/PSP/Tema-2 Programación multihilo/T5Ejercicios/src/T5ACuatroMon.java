import java.util.concurrent.Semaphore;

public class T5ACuatroMon {
	// Tantos palillos como filosofos. 
	// El palillo con el mismo indice de array que el filosofo es izq, uno mas es derecha
	// Si es el ultimo el de la derecha es el 0
	final int NUMFIL = 5;
	Semaphore  [] seArrPalUs = new Semaphore[NUMFIL];
	
	public T5ACuatroMon ()
	{
		for (int i=0;i<NUMFIL;i++)
		{
			seArrPalUs[i] = new Semaphore(1,true);	// Creo los palillos
		}
	}
	
	public void CogerPalillo(int iFil) throws InterruptedException
	{
		int iIndPalIz = iFil;			// Palillo izquierdo
		int iIndPalDe = 0;				// Palillo derecho
		
		System.out.println("\tFilosofo " + (iFil + 1) + " accede a coger palillos");
		if (iFil != (NUMFIL - 1) )
		{
			iIndPalDe =  iFil + 1;	
		}
		else
		{
			iIndPalDe =  0;	
		}
	
		boolean bPaillos = false;
		
		while(!bPaillos)
		{
			seArrPalUs[iIndPalIz].acquire();
			
			if(seArrPalUs[iIndPalDe].availablePermits() !=0)
			{
				seArrPalUs[iIndPalDe].acquire();
				bPaillos = true;
			}
			else
			{
				seArrPalUs[iIndPalIz].release();
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("\nFilosofo " + (iFil + 1) + " ha cogido los palillos para comer");
		MostrarInfoPal();				// Muestra disponibilidad de palillos
	}

	public void DevPalillo(int iFil)
	{
		int iIndPalIz = iFil;
		int iIndPalDe = 0;
		
		System.out.println("\nFilosofo " + (iFil + 1) + " devuelve palillos");
		if (iFil != (NUMFIL - 1) )
		{
			iIndPalDe =  iFil + 1;	
		}
		else
		{
			iIndPalDe =  0;	
		}
	
		seArrPalUs[iIndPalIz].release();
		seArrPalUs[iIndPalDe].release();
		MostrarInfoPal();				// Muestra disponibilidad de palillos
	}
	
	public void MostrarInfoPal()
	{
		String sInfoPal = "";

		for(int i=0; i< NUMFIL;i++)
		{
			if(seArrPalUs[i].availablePermits() == 0)
			{
				sInfoPal = sInfoPal + "X";
			}
			else
			{
				sInfoPal = sInfoPal + "-";
			}	
		}
		
		System.out.println("- (Libre) X (Ocupado): " + sInfoPal);
	}
}
