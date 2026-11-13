
public class T4AUnoH extends Thread {
	String sNombre;
	T4AUnoM mon;
	int iHijo;
	
	public T4AUnoH (String sNombre,T4AUnoM mon,int iHijo)
	{
		this.sNombre = sNombre;
		this.mon = mon;
		this.iHijo = iHijo;
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			mon.Escribir (iHijo, sNombre);
		}
	}
}
