
public class T4AUno {
	static T4AUnoM mon = new T4AUnoM();
	static T4AUnoH Ana = new T4AUnoH ("Ana",mon,0);
	static T4AUnoH Eva = new T4AUnoH ("Eva",mon,1);
	
	public static void main (String [] args)
	{
		try {
			Ana.start();
			Eva.start();
			Ana.join();
			Eva.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
