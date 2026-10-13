import java.util.Timer;

public class HiloPrin {
	public static void main (String [] args)
	{
		Monitor mon = new Monitor();
		HiloLect lector = new HiloLect(mon);
		HiloEsc escritor = new HiloEsc(mon);
		
		Timer miTimerEsc =  new Timer();
		miTimerEsc.schedule(escritor,1000,2000);	// Timer escritor, primera al segundo y repeticion cada dos
		Timer miTimerLect =  new Timer();
		miTimerLect.schedule(lector,1000,2000);		// Timer lector, primera a los dos segundos y repeticion cada dos
		
		// Tras 15 segundos muere el escritor.
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		miTimerEsc.cancel();
		System.out.println("Muere el timer escritor");

		while(true)
		{
			if(! lector.bVivo)
			{
				miTimerLect.cancel();
				break;
			}
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin del hilo principal");

	}
}
