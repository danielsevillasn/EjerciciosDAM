
public class T2CuatroH implements Runnable {
	int iDorsal;
	final int INUMVUEL = 20;
	T2CuatroM miMon;

	public T2CuatroH (int iDor, T2CuatroM mon)
	{
		iDorsal = iDor;
		miMon = mon;
	}
	
	@Override
	public void run() {
		System.out.println("Corredor: " + iDorsal + " inicia la carrera");

		for(int i=0; i <  INUMVUEL; i++)
		{
			try {
				Thread.sleep(100);					// Cada vuelta 100 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Corredor: " + iDorsal + " finaliza la carrera");
		
		miMon.addEntrada(iDorsal);
	}
	
}
