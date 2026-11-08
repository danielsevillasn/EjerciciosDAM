
public class T3ADos {
	
	
	public static void main (String [] args)
	{
		T3ADosM mon = new T3ADosM();
		T3ADosH Eva = new T3ADosH("Eva", mon);
		T3ADosH Ines = new T3ADosH("Ines", mon);
		T3ADosH Ana = new T3ADosH("Ana", mon);

		// No parece tener repercusion, al menos con este volumen de datos
		Ana.setPriority(Thread.MIN_PRIORITY);
		Ines.setPriority(Thread.MAX_PRIORITY);
		
		Ana.start();
		Eva.start();
		Ines.start();
		
		while(mon.iSaldo > 0)
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Reparto finalizado");
		System.out.println("Ana: " + mon.iRecAna);
		System.out.println("Eva: " + mon.iRecEva);
		System.out.println("Ines: " + mon.iRecInes);
	}
}
