/**
 * @author inma
 * @version 1.0
 */
package Eva2.HerenciaInterfaces.Ej9platoHerencia;


/**
 * @author inma
 * @version 1.0
 */
public class PilaDePlatos extends PlatoApilable {

	private PlatoApilable tope=null;
	private String nombrePila;
	/**
	 * Constructor
	 * @param nombre
	 */
	public PilaDePlatos(String nombre) {
		super();
		nombrePila = nombre;
	}

	//Metodos
	
	public void push(PlatoApilable nuevoPlato) { //PONER PLATO
		if(this.tope == null) {
			this.tope = nuevoPlato;
		}
		else {
			nuevoPlato.setPlatoDebajo(this.tope);
			this.tope = nuevoPlato;
		}
	}
	
	public Plato peek() {//MIRAR
		return tope;
	}
	
	public Plato pop() {//SACAR
		Plato devuelto= this.tope;
		this.tope=(PlatoApilable) this.tope.getPlatoDebajo();
		return devuelto;
	}

	@Override
	public String toString() {
		return "\nNombre pila: "+ nombrePila +"\n"+ tope;
	}
	
	
}
