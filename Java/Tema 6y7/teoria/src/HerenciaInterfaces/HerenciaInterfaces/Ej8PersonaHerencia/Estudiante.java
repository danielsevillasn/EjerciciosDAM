/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej8PersonaHerencia;

/**
 * @author inma
 * @version 1.0
 */
public class Estudiante extends Persona {

		private Estudios estudios;

		/**
		 * Constructor
		 * @param nombre
		 * @param direccion
		 * @param numeroDeTelefono
		 * @param email
		 * @param estudios
		 */
		public Estudiante(String nombre, String direccion, int numeroDeTelefono, String email, Estudios estudios) {
			super(nombre, direccion, numeroDeTelefono, email);
			this.estudios = estudios;
		}

		//Getters And Setters
		
		public Estudios getEstudios() {
			return estudios;
		}

		public void setEstudios(Estudios estudios) {
			this.estudios = estudios;
		}
		
		@Override
		public String toString() {
			return "Estudiante " + super.getNombre();
		}
		
}
