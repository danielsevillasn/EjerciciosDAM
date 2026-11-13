
public class T2TresH extends Thread {

	int iNombre;
	long lTiemIni;
	long lTiemFin;
	long iTiemTar;
	final int INUMVUEL = 100000;
	
	public T2TresH (int iIden)
	{
		iNombre = iIden;
	}
	
	@Override
	public void run ()
	{
		lTiemIni = System.currentTimeMillis();
		long lTiemPar;
		System.out.println("Inicia: " + iNombre + " en: " + lTiemIni);
		
		for (int i=0; i<INUMVUEL; i++)
		{
			lTiemPar = System.currentTimeMillis() - lTiemFin;
			// Lo pide el enunciado, pero no permite que se vea todo en consola
			// System.out.println("Coche " + iNombre + " en vuelta: " + i + " con tiempo: " + lTiemPar);
		}
		
		lTiemFin = System.currentTimeMillis();
		iTiemTar = lTiemFin - lTiemIni;
		System.out.println("Termina: " + iNombre + " en: " + lTiemFin);

	}
}
