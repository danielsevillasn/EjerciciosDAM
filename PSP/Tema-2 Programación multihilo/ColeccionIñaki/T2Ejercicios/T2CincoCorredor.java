
public class T2CincoCorredor extends Thread {

	int iCorredor;
	String sEquipo;
	
	public T2CincoCorredor (int iNum, String sEq)
	{
		iCorredor = iNum;
		sEquipo = sEq;
	}
	
	@Override
	public void run ()
	{
		for(int iPasos = 0; iPasos < 10; iPasos++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println("Equipo " + sEquipo + ". Corredor " + iCorredor + ". Completa vuelta: " + (iPasos + 1));
		}
		// System.out.println("Equipo " + sEquipo + ". Corredor " + iCorredor + ". Completa vuelta");
	}
}
