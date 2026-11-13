import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class T2Cinco {
	static final int NUMEQ = 4;
	static T2CincoEquipo [] miEqCorr;

	
	public static void main (String [] args)
	{
		InputStream [] is = new InputStream[NUMEQ];
		InputStreamReader [] isr = new InputStreamReader[NUMEQ];
		BufferedReader [] bf = new BufferedReader[NUMEQ];
		Process [] mp = new Process[NUMEQ];
		
		long [] lIniTime = new long[NUMEQ];
		long [] lFinTime = new long[NUMEQ];
		
		String [] arg = new String[3];
		arg[0] = "/usr/java/jdk-20.0.2/bin/java";
		arg[1] = "T2CincoEquipo";
		arg[2] = "";
	
		for(int iProc=0; iProc<NUMEQ;iProc++)
		{
			lIniTime[iProc] = System.currentTimeMillis();
			arg[2] = Integer.toString(iProc  + 1);
			ProcessBuilder mpb = new ProcessBuilder(arg);
			mpb.directory(new File ("./bin"));
			try {
				mp[iProc] = mpb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			is[iProc] = mp[iProc].getInputStream();
			isr[iProc] = new InputStreamReader(is[iProc]);
			bf[iProc] = new BufferedReader(isr[iProc]);
		}

		String sIn;
		boolean bAlgunoVivo = true;
		
		while(bAlgunoVivo)
		{
			bAlgunoVivo = false;	

			for(int iProc=0; iProc<NUMEQ;iProc++)
			{
				if(mp[iProc].isAlive())
				{
					bAlgunoVivo = true;						
					
					try {
						if(bf[iProc].ready())
						{
							sIn = bf[iProc].readLine();
							System.out.println(sIn);
							
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lFinTime[iProc] = System.currentTimeMillis();	// Actualiza mientras este vivo
				}
			}
		}

		int iGanador = 0;
		long lMenorT = Long.MAX_VALUE;
		
		for(int i=0;i<NUMEQ; i++)
		{
			if((lFinTime[i] - lIniTime[i]) < lMenorT)
			{
				iGanador = i;
				lMenorT = lFinTime[i] - lIniTime[i];
			}
				
			System.out.println("Eq " + (i+1) + ". Ini: " +  lIniTime[i] + " - Fin: " + lFinTime[i] + " Dif: " + (lFinTime[i] - lIniTime[i]));
		}
		
		System.out.println("El ganador ha sido el equipo: " + (iGanador + 1));

		
		System.out.println("Enhorabuena");
	}
}
