import java.util.Date;

public class T2A2Uno {
	public static void main(String [] args)
	{
		int arrUno [] = new int[1000000];
		int arrDos [] = new int[1000000];
		int arrTres [] = new int[1000000];
		int iResulUno = 0;
		int iResulDos = 0;
		int iResulTres = 0;
		
		long lMilIni = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++)
		{
			arrUno [i] = 1;
		}

		for (int i = 0; i < 1000000; i++)
		{
			arrDos [i] = 2;
		}
		
		for (int i = 0; i < 1000000; i++)
		{
			arrTres [i] = 3;
		}
		
		for (int i = 0; i < 1000000; i++)
		{
			iResulUno = iResulUno + arrUno [i];
		}

		for (int i = 0; i < 1000000; i++)
		{
			iResulDos = iResulDos + arrDos [i];
		}
		
		for (int i = 0; i < 1000000; i++)
		{
			iResulTres = iResulTres + arrTres [i];
		}

		System.out.println ("Array Uno: " + iResulUno);
		System.out.println ("Array Dos: " + iResulDos);
		System.out.println ("Array Tres: " + iResulTres);
		 
		long lMilFin = System.currentTimeMillis();
		long lTiempo = lMilFin - lMilIni;
		
		System.out.println ("Inicio en milisegundos: " + lMilIni);
		System.out.println ("Final en milisegundos: " + lMilFin);
		System.out.println ("Tiempo en milisegundos: " + lTiempo);

	}
}
