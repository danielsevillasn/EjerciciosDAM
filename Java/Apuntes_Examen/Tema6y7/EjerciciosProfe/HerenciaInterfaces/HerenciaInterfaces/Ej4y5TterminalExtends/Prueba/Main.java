/**
 * @author inma
 * @version 1.0
 */
package Ej4y5TterminalExtends.Prueba;
import Ej4y5TterminalExtends.Clases.Terminal;

/**
 * @author inma
 * @version 1.0
 */
public class Main {

	/**
	 * @author inma
	 * @version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		Terminal a = new Terminal (954129069);
		Terminal b = new Terminal (987654321);
		Terminal c = new Terminal (963852741);
		
		a.llamaA(b, 50);
		a.llamaA(c, 60);
		c.llamaA(a, 30);
		
		System.out.println("El terminal C ha estado "+ c.getTiempoDeLlamada()+" Segundos en llamada");
	}

}
