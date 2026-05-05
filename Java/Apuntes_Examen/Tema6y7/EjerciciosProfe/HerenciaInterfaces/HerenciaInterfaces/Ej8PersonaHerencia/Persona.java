/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej8PersonaHerencia;

/**
 * @author inma
 * @version 1.0
 */
public class Persona {
  //atributos o caracter�sticas
	private String nombre;
	private String direccion;
	private int numeroDeTelefono;
	private String email;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param numeroDeTelefono
	 * @param email
	 */
	public Persona(String nombre, String direccion, int numeroDeTelefono, String email) {
		//super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroDeTelefono = numeroDeTelefono;
		this.email = email;
	}

	//Getters And Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(int numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Persona " + getNombre();
	}
	
	
}
