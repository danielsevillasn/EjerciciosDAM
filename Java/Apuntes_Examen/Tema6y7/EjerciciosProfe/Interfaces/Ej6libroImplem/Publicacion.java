/**
 * @author inma
 * @version 1.0
 */

import java.time.LocalDate;

/**
 * @author inma
 * @version 1.0
 */
public abstract class Publicacion {

	private int isbn;
	private String titulo;
	private LocalDate añoPublicacion;
	
	
	/**
	 * Constructor
	 * @param isbn
	 * @param titulo
	 * @param añoPublicacion
	 */
	public Publicacion(int isbn, String titulo, LocalDate añoPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
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
		return añoPublicacion;
	}


	public void setanioPublicacion(LocalDate añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	
}
