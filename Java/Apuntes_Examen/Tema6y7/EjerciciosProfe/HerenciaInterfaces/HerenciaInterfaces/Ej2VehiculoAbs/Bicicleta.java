package EjemploAula.HerenciaInterfaces.Ej2VehiculoAbs;

/**
 * @author inma
 * @version 1.0
 */
public class Bicicleta extends Vehiculo {
	
	/*
	 * Atributos
	 */
	
	private int marchas;
	
	/*
	 * Constructores
	 */
	
	public Bicicleta(int marchas, int kmRecorridos) {
		super(kmRecorridos);
		this.marchas = marchas;
	}
	
	public Bicicleta(int marchas) {
		super();
		this.marchas = marchas;
	}
	
	public Bicicleta() {
		super();
		this.marchas = 1;
	}

	/*
	 * Getters and Setters
	 */
	
	public int getMarcha() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	
	/*
	 * Funciones
	 */

	@Override
	public void truco() {
		hazCaballito();
	}

    public void hazCaballito(){
        System.out.println("Haciendo el caballito");
}
}
