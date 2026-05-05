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
public class Libro extends Publicacion implements Prestable {
	
	private boolean prestado;

	/**
	 * @param isbn
	 * @param titulo
	 * @param a�oPublicacion
	 */
	public Libro(int isbn, String titulo, LocalDate a�oPublicacion) {
		super(isbn, titulo, a�oPublicacion);
		this.prestado = false;
	}

	//Getters and Setters
	
	public boolean isPrestado() {
		return prestado;
	}

	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	//Interface
	

	@Override
	public void presta() {
		if (!this.isPrestado()) {
			this.setPrestado(true);
		}
	}

	@Override
	public void devuelve() {
		this.setPrestado(false);	
	}

	@Override
	public boolean estaPrestado() {
		return this.isPrestado();
	}
	
	@Override
  public String toString(){
    String estado="";
    if (this.isPrestado()){
      estado="PRESTADO";
    }else{
      estado="NO PRESTADO";
    }
    return "El isbn es "+ super.getIsbn()+ " el titulo es: "+ super.getTitulo()+
      " \nel a�o de publicacion es: "+ super.getanioPublicacion()+ " \n el estado actual es "+ estado;
  }

}
