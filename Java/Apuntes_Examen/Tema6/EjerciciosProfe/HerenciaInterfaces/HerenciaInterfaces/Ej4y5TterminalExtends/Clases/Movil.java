/**
 * @author inma
 * @version 1.0
 */
package Ej4y5TterminalExtends.Clases;

/**
 * @author inma
 * @version 1.0
 */
public class Movil extends Terminal {

	private Tarifa tarifa;
	
	/**
	 * Constructor
	 * @param numero
	 */
	public Movil(int numero, Tarifa tarifa) {
		super(numero);
		this.tarifa = tarifa;
	}
	
	/*
	 * Getters and Setters
	 */

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	

	/*
	 * Funciones
	 */


	public void llamaA(Terminal llamado, int tiempoDeLlamada) {
		if(llamado instanceof Movil) {//ESTA LLAMANDO A OTRO MOVIL
		this.setTiempoDeLlamada((this.getTiempoDeLlamada()+tiempoDeLlamada));
		}
		else {//ESTA LLAMANDO A UN TERMINAL
			super.llamaA(llamado, tiempoDeLlamada);
		}
	}
	
	public int cobro(Movil esteMovil) {
		switch(this.tarifa) {
		case BIS:
			return (this.getTiempoDeLlamada()/60)*10;
		case PLUS:
			return (this.getTiempoDeLlamada()/60)*8;
		case TOTAL:
			return (this.getTiempoDeLlamada()/60)*5;
		}
			
		return 0;
	}
}
