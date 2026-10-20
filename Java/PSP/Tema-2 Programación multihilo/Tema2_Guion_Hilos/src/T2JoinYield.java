
public class T2JoinYield {
	public static void main (String [] args)
	{
		T2JoinYieldH1 hijoUno = new T2JoinYieldH1("Hijo uno");
		T2JoinYieldH2 hijoDos = new T2JoinYieldH2("Hijo dos");
		hijoUno.start();
		hijoDos.start();	
		
		try { hijoUno.join();} 
		catch(InterruptedException e) {	e.printStackTrace();}
		try { hijoDos.join(); } 
		catch (InterruptedException e) { e.printStackTrace(); }

		System.out.println("Termina programa");
	}

}
