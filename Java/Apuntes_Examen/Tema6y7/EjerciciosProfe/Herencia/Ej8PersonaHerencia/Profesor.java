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
public class Profesor extends Empleado {

	private String horario;
	private String categoria;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param i
	 * @param email
	 * @param oficina
	 * @param salario
	 * @param fechaContratacion
	 * @param horario
	 * @param categoria
	 */
	public Profesor(String nombre, String direccion, int i, String email, String oficina, int salario,
			LocalDate fechaContratacion, String horario, String categoria) {
		super(nombre, direccion, i, email, oficina, salario, fechaContratacion);
		this.horario = horario;
		this.categoria = categoria;
	}
	
	//Getters And Setters

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Profesor " + super.getNombre();
	}
	
	
	
}
