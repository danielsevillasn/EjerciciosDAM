
public class T2ASeis {

	static T2ASeisMonitor mon = new T2ASeisMonitor();
	static final int NUMTRENES = 3;
	static Thread [] aTrenesT = new Thread[NUMTRENES];
	static T2ASeisTren [] aTrenes = new T2ASeisTren[NUMTRENES];

	public static void main (String [] args)
	{
		for(int i=0;i<NUMTRENES;i++)
		{
			aTrenes[i] = new  T2ASeisTren(mon,i);
			aTrenesT[i] = new Thread(aTrenes[i]);
			aTrenesT[i].start();
			try {
				aTrenesT[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("El tiempo total tardado por los tres trenes es: " + mon.lTimepoTotal);
	}
}
