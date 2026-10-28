
public class T3ADosM {
	int iSaldo = 2000;
	int iRecEva = 0;
	int iRecAna = 0;
	int iRecInes = 0;
	
	public synchronized void SacarDinero (String sNombre)
	{
		if(sNombre.equals("Ana"))
		{
			iRecAna = iRecAna + 10;
		}
		else if(sNombre.equals("Ines"))
		{
			iRecInes = iRecInes + 10;
		}
		else if(sNombre.equals("Eva"))
		{
			iRecEva = iRecEva + 10;
		}
		iSaldo = iSaldo - 10;
	}
}
