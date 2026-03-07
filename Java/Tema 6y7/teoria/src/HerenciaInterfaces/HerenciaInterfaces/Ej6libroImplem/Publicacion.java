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
public abstract class Publicacion {

	private int isbn;
	private String titulo;
	private LocalDate a�oPublicacion;
	
	
	/**
	 * Constructor
	 * @param isbn
	 * @param titulo
	 * @param a�oPublicacion
	 */
	public Publicacion(int isbn, String titulo, LocalDate a�oPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.a�oPublicacion = a�oPublicacion;
	}
	
	
	//Getters and Setters
	
	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDate getanioPublicacion() {
		return a�oPublicacion;
	}


	public void setanioPublicacion(LocalDate a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	
	
}
