
public class T3ACuatroH extends Thread {
	T3ACuatroM mon;
	public T3ACuatroH (T3ACuatroM mon) 
	{
		this.mon  = mon;
	}
	 
	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(100);
				// Thread.sleep(200); // Prueba cambiando tiempos en hilos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Anadiendo (" + (i+1) + ") HOLA");
			mon.miArrList.add("HOLA");
		}
	}
}
