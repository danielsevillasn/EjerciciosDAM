
public class T3AUnoM {
	int iNumAAcer = 0;
	int iIntentosUno = 0;
	int iIntentosDos = 0;
	boolean bAcertado;
	int iAcertante;
	
	public T3AUnoM()
	{
		iNumAAcer = (int)(Math.random() * 50);	// Enunciado dice 500
		bAcertado = false;
	}
	
	public synchronized void ComprobarAcierto(int iHijo,int iValor)
	{
		// System.out.println(bApostando);

		System.out.println("Jugador " + iHijo + ": " + iValor);
		
		if (iHijo == 1)
		{
			iIntentosUno++;
		}
		else
		{
			iIntentosDos++;
		}
		
		if(iValor == iNumAAcer)
		{
			bAcertado = true;
			iAcertante = iHijo;
		}
	}
}
