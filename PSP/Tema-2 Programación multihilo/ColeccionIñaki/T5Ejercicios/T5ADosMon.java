import java.util.concurrent.Semaphore;

public class T5ADosMon {
	Semaphore parcking = new Semaphore(10,true);
	long [] lInitTime = new long[40];
	long [] lFintTime = new long[40];
	boolean [] bHaAccedido = new boolean[40];
	int iCochesEsp = 0;

	public void Acceder (T5ADosCoche coche)
	{
		try {
			System.out.println("Coches en cola: " + iCochesEsp);
			if(iCochesEsp < 3)
			{
				bHaAccedido[coche.idCoche - 1] = true;
				iCochesEsp ++;
				parcking.acquire();
				iCochesEsp --;
				lInitTime[coche.idCoche - 1] = System.currentTimeMillis();
				System.out.println("Coche " + coche.idCoche + " accede al parking.");
				System.out.println("Plazas disponibles: " + parcking.availablePermits());
			}
			else
			{
				bHaAccedido[coche.idCoche - 1] = false;
				System.out.println("Demasiados coches, me marcho. Coche: " + coche.idCoche);
			}
			
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Salir (T5ADosCoche coche)
	{
		parcking.release();
		lFintTime[coche.idCoche - 1] = System.currentTimeMillis();
		System.out.println("Coche " + coche.idCoche + " se marcha del parcking.");
		System.out.println("Plazas disponibles: " + parcking.availablePermits());
	}
}
