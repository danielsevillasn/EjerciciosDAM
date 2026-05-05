/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej6libroImplem;

import java.time.LocalDate;

/**
 * @author inma
 * @version 1.0
 */
public class Revista extends Publicacion {
	
	int numero;

	/**
	 * constructor
	 * @param isbn
	 * @param titulo
	 * @param a�oPublicacion
	 * @param numero
	 */
	public Revista(int isbn, String titulo, LocalDate a�oPublicacion, int numero) {
		super(isbn, titulo, a�oPublicacion);
		this.numero = numero;
	}

	//Getters and Setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
}
