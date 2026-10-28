import java.util.Scanner;

public class T5AUno {
	public static void main (String [] args)
	{
		T5AUnoCliente [] arrCli;
		T5AUnoMon mon = new T5AUnoMon();
		
		Scanner miScan = new Scanner(System.in);
		System.out.print("¿Cuantos clientes tiene la barberia? ");
		String sCli = miScan.nextLine();
		miScan.close();
		int iCli = Integer.parseInt(sCli);
		arrCli = new T5AUnoCliente[iCli];
		
		for (int i= 0; i< iCli; i++)
		{
			arrCli[i] = new T5AUnoCliente(i+1,mon);
			arrCli[i].start();
		}

		for (int i= 0; i< iCli; i++)
		{
			try {
				arrCli[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
