/**
 * @author inma
 * @version 1.0
 */

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
	 * @param añoPublicacion
	 */
	public Libro(int isbn, String titulo, LocalDate añoPublicacion) {
		super(isbn, titulo, añoPublicacion);
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
      " \nel año de publicacion es: "+ super.getanioPublicacion()+ " \n el estado actual es "+ estado;
  }

}
