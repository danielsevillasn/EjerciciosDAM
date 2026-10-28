
public class T5ADosCoche extends Thread {
	int idCoche;
	T5ADosMon mon;
	
	public T5ADosCoche (int idCoche, T5ADosMon mon)
	{
		this.idCoche = idCoche;
		this.mon = mon;
	}	
	
	@Override
	public void run ()
	{
		int iTiempoCir = ((int) (Math.random() * 900)) + 100;
		System.out.println("Coche " + idCoche + ". Circula: " + iTiempoCir + " mseg.");
		try {
			Thread.sleep(iTiempoCir);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		mon.Acceder(this);	// Accede al parking
		
		if(mon.bHaAccedido[idCoche - 1])
		{
			int iTiempoPelado = ((int) (Math.random() * 2000)) + 1000;
			try {
				Thread.sleep(iTiempoPelado);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			mon.Salir(this);		// Se marcha del parking
		}
	}
}
