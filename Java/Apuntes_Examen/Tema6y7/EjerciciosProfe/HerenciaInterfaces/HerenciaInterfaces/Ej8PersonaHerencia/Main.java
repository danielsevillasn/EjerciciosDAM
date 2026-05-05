/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej8PersonaHerencia;

import java.time.LocalDate;

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

		Profesor Mariano = new Profesor ("Mariano", "Calle Inventada 12", 954781256, 
      "Mariano@gmail.com", "Departamento de Informatica", 1600, LocalDate.of(20012, 5, 14), 
      "8:00-15:30","Informatica");
		System.out.println(Mariano);
	}

}
