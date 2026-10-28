
public class T4AUnoM 
{
	boolean [] bEsc = new boolean[2];
	
	public T4AUnoM()
	{
		bEsc[0] = true;
		bEsc[1] = false;
	}
	
	public void EscNom (String sNombre)
	{
		System.out.println(sNombre);
	}
	
	
	public synchronized void Escribir (int iHijo, String sNombre)
	{
		int iOtroHijo = 0;
		if(iHijo == 0)
		{
			iOtroHijo = 1;
		}
				
		while(! bEsc[iHijo])
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bEsc[iHijo] = false;
		bEsc[iOtroHijo] = true;

		EscNom(sNombre);
		notifyAll();
	}
	
}
