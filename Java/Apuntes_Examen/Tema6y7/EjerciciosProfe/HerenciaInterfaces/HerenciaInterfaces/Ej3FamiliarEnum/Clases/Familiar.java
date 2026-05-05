/**
Clase Familiar
 */
package Ej3FamiliarEnum.Clases;

import java.time.LocalDate;
import java.util.Date;


/**
 * @author inma
 * @version 1.0
 */
public class Familiar {

	private String nombre;
	private Familiar padre;
	private Familiar madre;
	private LocalDate fechaNacimiento;
	private Sexo sexo;

	
	/**
	 * Constructor de Familiar
	 * @param nombre
	 * @param padre
	 * @param madre
	 * @param fechaNacimiento
	 * @param sexo
	 */
	
	public Familiar(String nombre, Familiar padre, Familiar madre, LocalDate fechaNacimiento, Sexo sexo) {
		this.nombre = nombre;
		this.padre = padre;
		this.madre = madre;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}

	/*
	 * Getters and Setters
	 */

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Familiar getPadre() {
		return padre;
	}


	public void setPadre(Familiar padre) {
		this.padre = padre;
	}


	public Familiar getMadre() {
		return madre;
	}


	public void setMadre(Familiar madre) {
		this.madre = madre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	/*
	 * Equals
	 */
		
	/*
	 * Funciones
	 */
	
	public boolean esMiPadre(Familiar padreomadre) {
		if (this.padre.equals(padreomadre) || this.madre.equals(padreomadre)) {
			return true;
		}
		return false;
	}

	public boolean esMiHermano(Familiar hermano) {
		if (this.padre.equals(hermano.getPadre()) || this.madre.equals(hermano.getMadre())) {
			return true;
		}
		return false;
	}
	
	public boolean esMiAbuelo(Familiar abuelo) {
		if (this.padre.padre.equals(abuelo)) {
			return true;
		}
		return false;
	}
	
	public boolean esMiTio(Familiar tio) {
		return this.padre.esMiHermano(tio);
	}

	
}
