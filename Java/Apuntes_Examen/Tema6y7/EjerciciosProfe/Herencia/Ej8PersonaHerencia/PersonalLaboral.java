/**
 * @author inma
 * @version 1.0
 */
package Eva2.HerenciaInterfaces.Ej8PersonaHerencia;

import java.time.LocalDate;

/**
 * @author inma
 * @version 1.0
 */
public class PersonalLaboral extends Empleado {
	
	private String titulacion;

	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param numeroDeTelefono
	 * @param email
	 * @param oficina
	 * @param salario
	 * @param fechaContratacion
	 * @param titulacion
	 */
	public PersonalLaboral(String nombre, String direccion, int numeroDeTelefono, String email, String oficina,
			int salario, LocalDate fechaContratacion, String titulacion) {
		super(nombre, direccion, numeroDeTelefono, email, oficina, salario, fechaContratacion);
		this.titulacion = titulacion;
	}
	
	//Getters And Setters

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	@Override
	public String toString() {
		return "Personal Laboral " + super.getNombre();
	}

}
