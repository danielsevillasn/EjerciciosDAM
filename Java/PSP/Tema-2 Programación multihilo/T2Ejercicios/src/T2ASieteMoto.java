
public class T2ASieteMoto extends Thread {
	
	double dMiVel;	// Velocidad de 50-100 por segundo sin considerar unidades
	int iNumMoto;
	T2ASieteMon mon;
	
	public T2ASieteMoto (int iNumMoto,T2ASieteMon monitor)
	{
		dMiVel = 5 + ((int) (Math.random() * 5));
		this.iNumMoto = iNumMoto;
		mon = monitor;
	}
	
	@Override
	 public void run() {
		
		System.out.println("La moto " + (iNumMoto + 1) + " corre a una velocidad de " + ((int)dMiVel));
		while(!mon.getbCarrTer())
		{
			try {							// Cada segundo recorre su velocidad (iMiVel)
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(!mon.getbCarrTer())
			{
				mon.dDistMoto[iNumMoto] = mon.dDistMoto[iNumMoto] + (dMiVel * 0.01);
			}	
				
			if(mon.dDistMoto[iNumMoto] >= mon.dDistCir)
			{
				mon.setbCarrTer(true);
			}
		}
	}
}
