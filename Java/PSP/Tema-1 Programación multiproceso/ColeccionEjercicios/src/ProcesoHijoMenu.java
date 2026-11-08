import java.util.Scanner;

public class ProcesoHijoMenu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String mensajePadre = "";
		while(s.hasNextLine()) {
			mensajePadre = s.nextLine();
			if(mensajePadre.equalsIgnoreCase("SALUDO")) {
				System.out.println("HOLA, SOY TU HIJO”");
			}else {
				System.out.println(mensajePadre);
			}
		}
		s.close();
	}

}
