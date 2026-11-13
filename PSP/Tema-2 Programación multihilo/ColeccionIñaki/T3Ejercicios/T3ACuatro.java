
public class T3ACuatro {
	public static void main (String [] args)
	{	
		T3ACuatroM mon = new T3ACuatroM();
		T3ACuatroH hiloPush = new T3ACuatroH(mon);
		T3CuatroH2 hiloPop = new T3CuatroH2(mon);
		hiloPush.start();
		hiloPop.start();
		try {
			hiloPush.join();
			hiloPop.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin de programa");
	}
}