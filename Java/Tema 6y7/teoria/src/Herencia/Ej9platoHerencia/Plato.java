/**
 * @author inma
 * @version 1.0
 */
package Eva2.HerenciaInterfaces.Ej9platoHerencia;

/**
 * @author inma
 * @version 1.0
 */
public class Plato {
	
	private tipoPlato tipoDePlato;
	private String color;
	
	/**
	 * Constructores
	 * @param tipoDePlato
	 * @param color
	 */
	public Plato(tipoPlato tipoDePlato, String color) {
		this.tipoDePlato = tipoDePlato;
		this.color = color;
	}
	
	public Plato() {
	}
	
	//Getters And Setters

	public tipoPlato getTipoDePlato() {
		return tipoDePlato;
	}

	public void setTipoDePlato(tipoPlato tipoDePlato) {
		this.tipoDePlato = tipoDePlato;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "\n Plato "+ tipoDePlato + " de color " + color;
	}
	
}
