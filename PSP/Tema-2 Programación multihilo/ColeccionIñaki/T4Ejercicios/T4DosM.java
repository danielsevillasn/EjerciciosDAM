
public class T4DosM {
	int iCesto = 0;
	
	/* Version sin wait-notify ini
	public void PonerBarra()
	{
		iCesto++;
		System.out.println("Nueva barra. Hay " + iCesto + " barras");
	}
	
	public void SacarBarra()
	{
		iCesto--;
		System.out.println("Recibe barra. Hay " + iCesto + " barras");
	}
	Version sin wait-notify fin */	

	// Version con wait-notify ini
	public synchronized void PonerBarra()
	{
		while (iCesto >= 5)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		iCesto++;
		System.out.println("Nueva barra. Hay " + iCesto + " barras");
		notifyAll();
	}
	
	public synchronized void SacarBarra()
	{
		while (iCesto == 0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		iCesto--;
		System.out.println("Recibe barra. Hay " + iCesto + " barras");
		notifyAll();
	}
	// Version con wait-notify fin
}
