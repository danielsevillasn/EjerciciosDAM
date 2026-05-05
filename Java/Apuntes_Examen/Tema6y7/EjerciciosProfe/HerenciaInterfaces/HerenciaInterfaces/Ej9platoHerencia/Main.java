/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej9platoHerencia;

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

		PilaDePlatos pila1 = new PilaDePlatos("Pila de la cocina");
		PlatoApilable plato1 = new PlatoApilable(tipoPlato.HONDO, "rojo");
		PlatoApilable plato2 = new PlatoApilable(tipoPlato.LLANO, "rojo");
		PlatoApilable plato3 = new PlatoApilable(tipoPlato.POSTRE, "azul");
		PlatoApilable plato4 = new PlatoApilable(tipoPlato.HONDO, "verde");
		
		pila1.push(plato1);
		pila1.push(plato2);
		pila1.push(plato4);
		pila1.push(plato3);
		
		System.out.println("Este es el tope de la pila "+pila1.peek());
		System.out.println("\nPlato extraido " + pila1.pop());
		System.out.println("\nEste es el tope de la pila "+pila1.peek());
		System.out.println(pila1);
	}

}
