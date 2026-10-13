
public class T5AUnoCliente extends Thread {
	int idCliente;
	T5AUnoMon mon;
	
	public T5AUnoCliente (int idCliente, T5AUnoMon mon)
	{
		this.idCliente = idCliente;
		this.mon = mon;
	}
	
	@Override
	public void run ()
	{
		int iTiempoPaseo = ((int) (Math.random() * 900)) + 100;
		System.out.println("Cliente " + idCliente + ". Pasea: " + iTiempoPaseo + " mseg.");
		try {
			Thread.sleep(iTiempoPaseo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mon.Sentar(this);	// Pasa a la barberia para sentarse
		
		int iTiempoPelado = ((int) (Math.random() * 700)) + 300;
		try {
			Thread.sleep(iTiempoPelado);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mon.Marchar(this);
	}
}
