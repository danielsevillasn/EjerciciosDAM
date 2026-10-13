
public class T3AUnoH implements Runnable {

	T3AUnoM mon;
	int iNumHijo;
	
	public T3AUnoH (int iNumHijo,T3AUnoM mon) 
	{
		this.iNumHijo = iNumHijo;
		this.mon = mon;
	}
	
	@Override
	public void run() {
		while (! mon.bAcertado)
		{
			int iValor = (int)(Math.random() * 50);	// Enunciado dice 500
			// System.out.println("Jugador " + iNumHijo + ": " + iValor);
			mon.ComprobarAcierto(iNumHijo,iValor);

			try {
				// Fuerza cambio de contexto. Con 50 mseg para que no vuelva a ser este hilo el que obtiene 
				// planificador de nuevo
				Thread.sleep(50);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
