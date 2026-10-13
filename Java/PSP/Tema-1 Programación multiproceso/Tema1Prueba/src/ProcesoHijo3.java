import java.util.Scanner;

public class ProcesoHijo3 {
	public static void main(String[] args) {
		Scanner miScan = new Scanner(System.in);
		String sInfo = miScan.nextLine(); // A la espera hasta recibir algo
		System.out.println("Recibido: " + sInfo);
		System.out.println("Te devuelvo el saludo");
		miScan.close();
	}
}