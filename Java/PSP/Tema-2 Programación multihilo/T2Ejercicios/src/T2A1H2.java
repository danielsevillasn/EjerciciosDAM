
public class T2A1H2 implements Runnable {
	int iNombre;
	
	public T2A1H2 (int iMiNom)
	{
		iNombre = iMiNom;
	}
	
	@Override
	public void run ()
	{
		try {
			Thread.sleep(iNombre * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hola mundo. Soy " + iNombre);
	}
}
