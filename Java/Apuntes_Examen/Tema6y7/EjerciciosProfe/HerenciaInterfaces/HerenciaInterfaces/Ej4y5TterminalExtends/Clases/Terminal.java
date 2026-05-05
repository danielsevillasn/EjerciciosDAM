/**
 
 */
package Ej4y5TterminalExtends.Clases;

/**
 * @author inma
 * @version 1.0
 */
public class Terminal {
	private int numero;
	private int tiempoDeLlamada;
	
	
	/**
	 * Constructor
	 * @param numero
	 */
	public Terminal(int numero) {
		this.numero = numero;
		this.tiempoDeLlamada = 0;
	}
	
	/*
	 * Getters and Setters
	 */


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getTiempoDeLlamada() {
		return tiempoDeLlamada;
	}


	public void setTiempoDeLlamada(int tiempoDeLlamada) {
		this.tiempoDeLlamada = tiempoDeLlamada;
	}
	
	/*
	 * Funciones
	 */
	
	public void llamaA (Terminal Telefono, int tiempoDeLlamada) {
		this.tiempoDeLlamada += tiempoDeLlamada;
		Telefono.tiempoDeLlamada += tiempoDeLlamada;
	}
	

}
