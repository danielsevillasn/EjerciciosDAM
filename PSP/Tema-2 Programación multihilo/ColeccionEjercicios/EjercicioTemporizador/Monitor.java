package EjercicioTemporizador;

/**
 * Clase monitor que monitoriza las variables que son utilizadas y actualizadas
 * por las diferentes tareas
 * 
 */
public class Monitor {
	private String publicacion = "";

	public void actualizaInfo(int iPub) {
		this.publicacion = "Publicacion " + iPub;
	}

	public String devuelveInfo() {
		return publicacion;
	}
}