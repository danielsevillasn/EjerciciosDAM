import java.util.Scanner;

public class T5ADos {

	public static void main(String [] args)
	{
		T5ADosCoche [] arrCoches = new T5ADosCoche[40];
		
		T5ADosMon mon = new T5ADosMon();
		
		int iCoch = 20;
		arrCoches = new T5ADosCoche[iCoch];
		
		for (int i= 0; i< iCoch; i++)
		{
			arrCoches[i] = new T5ADosCoche(i+1,mon);
			arrCoches[i].start();
		}

		for (int i= 0; i< iCoch; i++)
		{
			try {
				arrCoches[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i= 0; i< iCoch; i++)
		{
			System.out.println("El coche " + (i + 1) + " ha estado " + (mon.lFintTime[i] - mon.lInitTime[i]));
		}
		
	}
}
