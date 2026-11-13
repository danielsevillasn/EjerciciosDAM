
public class T3CuatroH2 extends Thread {
	T3ACuatroM mon;
	public T3CuatroH2 (T3ACuatroM mon) 
	{
		this.mon  = mon;
	}

	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(200);
				// Thread.sleep(100); // Prueba cambiando tiempos en hilos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (mon.miArrList.size() > 0)
			{
				System.out.println("Leyendo (" + (i+1) + ") " + mon.miArrList.get(0));
				mon.miArrList.remove(0);
			}
			else
			{
				System.out.println("Array vacio");
				i--; 
			}
		}
	}
}
