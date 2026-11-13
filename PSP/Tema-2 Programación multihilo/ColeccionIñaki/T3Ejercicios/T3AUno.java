
public class T3AUno {
	public static void main (String [] args)
	{
		T3AUnoM miMon = new T3AUnoM();
		T3AUnoH HUno = new T3AUnoH(1,miMon);
		T3AUnoH HDos = new T3AUnoH(2,miMon);
		
		Thread TUno = new Thread(HUno);
		Thread TDos = new Thread(HDos);
		
		System.out.println("Arbitro: Num Escrito: " + miMon.iNumAAcer);
		
		int iIni = (int)(Math.random() * 2);
		System.out.println("El turno es para: " + (iIni +1));
		
		if(iIni == 0)
		{
			TUno.start();
			TDos.start();
		}
		else
		{
			TDos.start();
			TUno.start();
		}
	
		while(!miMon.bAcertado)
		{
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(miMon.iAcertante == 1)
		{
			System.out.println("Arbitro: Jugador " + miMon.iAcertante + " acierta despues de " + miMon.iIntentosUno + " intentos");
		}
		else
		{
			System.out.println("Arbitro: Jugador " + miMon.iAcertante + " acierta despues de " + miMon.iIntentosDos + " intentos");
		}
	}
}
