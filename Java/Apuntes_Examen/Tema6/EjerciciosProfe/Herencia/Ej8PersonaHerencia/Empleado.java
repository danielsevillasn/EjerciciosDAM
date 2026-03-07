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
public class Empleado extends Persona {

		private String oficina;
		private int salario;
		private LocalDate fechaContratacion;
		
		/**
		 * Constructor
		 * @param nombre
		 * @param direccion
		 * @param telf
		 * @param email
		 * @param oficina
		 * @param salario
		 * @param fechaContratacion
		 */
		public Empleado(String nombre, String direccion, int telf, String email, String oficina,
				int salario, LocalDate fechaContratacion) {
			super(nombre, direccion, telf, email);
			this.oficina = oficina;
			this.salario = salario;
			this.fechaContratacion = fechaContratacion;
		}
		
		//Getters And Setters

		public String getOficina() {
			return oficina;
		}

		public void setOficina(String oficina) {
			this.oficina = oficina;
		}

		public int getSalario() {
			return salario;
		}

		public void setSalario(int salario) {
			this.salario = salario;
		}

		public LocalDate getFechaContratacion() {
			return fechaContratacion;
		}

		public void setFechaContratacion(LocalDate fechaContratacion) {
			this.fechaContratacion = fechaContratacion;
		}
		
		@Override
		public String toString() {
			return "Empleado " + super.getNombre();
		}
		
		
}
