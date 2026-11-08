
public class T4ACuatro {
	static final int NUMCON = 5;
	public static void main (String [] args)
	{
		T4A4Mon mon = new T4A4Mon();
		T4A4Con [] consum = new T4A4Con [NUMCON];
		T4A4Prod productor = new T4A4Prod(mon);
		
		productor.start();
		
		for(int i=0;i<NUMCON;i++)
		{
			consum[i] = new T4A4Con((i+1),mon);
			consum[i].start();
		}
		
		try {
			productor.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("TERMINADO EL PRODUCTOR");
		
		for(int i=0;i<NUMCON;i++)
		{
			System.out.println("Vendidos " + consum[i].iNumCochesCom + " coches del tipo " + (i+1));
			consum[i].interrupt();
		}
		
	}
}
