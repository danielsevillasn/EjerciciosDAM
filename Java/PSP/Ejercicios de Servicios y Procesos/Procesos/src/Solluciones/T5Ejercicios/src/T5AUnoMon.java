import java.util.concurrent.Semaphore;

public class T5AUnoMon {
	// Una silla, guarda orden de llegada para ir sentando clientes
	Semaphore silla = new Semaphore(1,true);	
	
	public void Sentar (T5AUnoCliente cliente)
	{
		try {
			silla.acquire();
			System.out.println("Cliente " + cliente.idCliente + " acaba de sentarse en la silla.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Marchar (T5AUnoCliente cliente)
	{
		System.out.println("Cliente " + cliente.idCliente + " se marcha de la barberia.");
		silla.release();
	}
	
}
