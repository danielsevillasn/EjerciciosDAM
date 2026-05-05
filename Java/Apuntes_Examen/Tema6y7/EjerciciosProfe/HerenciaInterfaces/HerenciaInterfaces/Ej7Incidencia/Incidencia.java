/**
 * @author inma
 * @version 1.0
 */
package Ej7Incidencia;

/**
 * @author inma
 * @version 1.0
 */
public class Incidencia {

	private int puesto;
	private String problema;
	private int estaIncidencia;
	private static int numeroDeIncidencia;
	private boolean pendiente;
	static int contadorPendientes;
	private String solucion;

	/**
	 * constructor
	 * 
	 * @param puesto
	 * @param problema
	 */
	public Incidencia(int puesto, String problema) {
		this.puesto = puesto;
		this.problema = problema;
		this.pendiente=true;
		Incidencia.numeroDeIncidencia += 1;
		this.estaIncidencia = Incidencia.getNumeroDeIncidencia();
		Incidencia.contadorPendientes += 1;
	}

	// Getters and Setters

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public static int getContadorPendientes() {
		return contadorPendientes;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public static int getNumeroDeIncidencia() {
		return numeroDeIncidencia;
	}

	public static void setNumeroDeIncidencia(int numeroDeIncidencia) {
		Incidencia.numeroDeIncidencia = numeroDeIncidencia;
	}

	// ToString

	//Tiene un mensaje por degecto siempre y cuando no este pendiente ene se caso tendrÃ¡ solucion 
	@Override
	public String toString() {
		if (!pendiente)
			return this.getSolucion();

		return "Incidencia " + estaIncidencia + " - Puesto: " + puesto + " - " + problema + " - Pendiente";

	}

	// Functions

	//Pasa el mensaje de solución a una variable para cada objeto que será llamada en el String en caso de poder llamarse
	public void resuelve(String solucion) {
		this.setPendiente(false);
		Incidencia.contadorPendientes -= 1;
		this.setSolucion("Incidencia " + estaIncidencia + " - Puesto: " + puesto + " - " + problema + " " + solucion);
	}

	//Simplemente llamara al contador de pedientes
	public static int getPendientes() {
		return getContadorPendientes();
	}

}
