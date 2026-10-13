public class ProcesoHijo2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	// System.exit(0);	
		System.exit(10);
	}
}