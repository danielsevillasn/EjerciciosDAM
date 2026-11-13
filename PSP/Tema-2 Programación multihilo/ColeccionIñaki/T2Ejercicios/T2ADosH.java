
public class T2ADosH extends Thread {
	int iMul;
	
	public T2ADosH (int i)
	{
		iMul = i;
	}
	
	@Override
	public void run ()
	{
		int arr [] = new int[1000000];
		int iResul = 0;

		for (int i = 0; i < 1000000; i++)
		{
			arr [i] = iMul;
		}
		
		for (int i = 0; i < 1000000; i++)
		{
			iResul = iResul + arr [i];
		}

		System.out.println ("Array " + iMul + ": " + iResul);
	}
}
