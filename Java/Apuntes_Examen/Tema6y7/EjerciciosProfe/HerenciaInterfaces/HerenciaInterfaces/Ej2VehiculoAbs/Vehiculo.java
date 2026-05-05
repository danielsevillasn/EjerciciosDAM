/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej2VehiculoAbs;

/**
 * @author inma
 * @version 1.0
 */
public abstract class Vehiculo{

	/*
	 * Atributos
	 */
	
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	private int kmRecorridos;

	/*
	 * Constructores
	 */
	
	//TODOS LOS PARAMETROS
	public Vehiculo(int kmRecorridos) {
		Vehiculo.incrementaVehiculosCreados();
		this.anda(kmRecorridos);
	}
	
	//SIN PARAMETROS
	public Vehiculo() {
		Vehiculo.incrementaVehiculosCreados();
		this.kmRecorridos = 0;
	}
	
	/*
	 * Getters and Setters
	 */
	
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
	
	public void setVehiculosCreados(int vehivulosCreados) {
		this.vehiculosCreados = vehivulosCreados;
	}
	
	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public void setKilometrosTotales(int kilometrosTotales) {
		this.kilometrosTotales = kilometrosTotales;
	}
	
	public int getKmRecorridos () {
		return this.kmRecorridos;
	}
	
	public void setKmRecorridos (int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	
	/*
	 * Funciones
	 */
	
	private static void incrementaVehiculosCreados() {
		Vehiculo.vehiculosCreados++;
	}

	public void anda(int kmRecorridos) {
		Vehiculo.kilometrosTotales+=kmRecorridos;
		this.kmRecorridos+=kmRecorridos;
	}

	
	public abstract void truco();

}
