/**
 * @author inma
 * @version 1.0
 */
package Eva2.HerenciaInterfaces.Ej9platoHerencia;

/**
 * @author inma
 * @version 1.0
 */
public class PlatoApilable extends Plato {

	private Plato platoDebajo;

	/**
	 * Constructor
	 * @param tipoDePlato
	 * @param color
	 * @param platoDebajo
	 */
	public PlatoApilable(tipoPlato tipoDePlato, String color) {
		super(tipoDePlato, color);
	}

	public PlatoApilable() {
		super();
	}
	//Getters And Setters
	
	public Plato getPlatoDebajo() {
		return platoDebajo;
	}

	public void setPlatoDebajo(Plato platoDebajo) {
		this.platoDebajo = platoDebajo;
	}
	
	//ToString
	//Dejo la solución propuesta por José Carlos, pero aquí no sería necesario implementar el toString(), ya que lo hereda de Plato,
    // y sólo necesito ver esa información.
	@Override
	public String toString() {
		if (this.platoDebajo == null)
			return "\n Plato apilable " + this.getTipoDePlato() + " "+ this.getColor() + " Sin plato debajo";
		return "\n Plato apilable " + this.getTipoDePlato() + " "+ this.getColor() + " Plato debajo: " + this.platoDebajo;
	}
	
	
}
