/**
 * @author inma
 * @version 1.0
 */

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
	 * @param añoPublicacion
	 * @param numero
	 */
	public Revista(int isbn, String titulo, LocalDate añoPublicacion, int numero) {
		super(isbn, titulo, añoPublicacion);
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
