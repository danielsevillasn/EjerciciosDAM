package EjercicioTemporizador;
import java.util.Timer;

public class PrincipalTimer {
    public static void main (String [] args)
	{
		Monitor mon = new Monitor();
		TareaLector lector = new TareaLector(mon);
		TareaEscritor escritor = new TareaEscritor(mon);
		
		Timer timerEscritura =  new Timer();
		timerEscritura.schedule(escritor,1000,2000);	// Timer escritor, primero al segundo y repeticion cada dos segundos
		Timer timerLectura =  new Timer();
		timerLectura.schedule(lector,2000,2000);		// Timer lector, primero a los dos segundos y repeticion cada dos segundos
		
		// Tras 15 segundos muere el escritor.
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		timerEscritura.cancel(); //Termina el timer de escritura
		System.out.println("Muere el timer escritor");

		while(true)
		{
			if(!lector.estaVivo)
			{
				timerLectura.cancel(); //Termina el timer de lectura
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