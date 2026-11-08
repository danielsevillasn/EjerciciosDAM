
public class T2AOcho {
	static final int NUMCOC = 4;
	static T2AOchoM mon = new T2AOchoM();
	
	public static void main (String [] args)
	{
		T2AOchoH [] conieros = new T2AOchoH[NUMCOC];
		
		for (int i=0;i<NUMCOC;i++)
		{
			conieros[i] = new T2AOchoH((i),mon);
		 	conieros[i].start();
		}

		for (int i=0;i<NUMCOC;i++)
		{
			try {
				conieros[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i=0;i<NUMCOC;i++)
		{
			System.out.println("El cocinero " + (i+1) + " ha tardado: " + mon.lTiempoCoc[i] + " msec");
		}	
	}
}
