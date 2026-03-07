package EjemploAula.HerenciaInterfaces.Ej2VehiculoAbs;

/**
 * @author inma
 * @version 1.0
 */
public class Coche extends Vehiculo {
	
	/*
	 * Atributos
	 */
	
	private String marca;
	
	/*
	 * Constructores
	 */
	
	public Coche(String marca, int kmRecorridos) {
		super(kmRecorridos);
		this.marca = marca;
	}
	
	public Coche(String marca) {
		super();
		this.marca = marca;
	}
	
	public Coche(int kmRecorridos) {
		super(kmRecorridos);
		this.marca = "Desconocida";
	}
	
	public Coche() {
		super();
		this.marca = "Desconocida";
	}
	
	/*
	 * Getters and Setters
	 */
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	/*
	 * Funciones
	 */

	@Override
	public void truco() {
		quemaRuedas();
	}

    public void quemaRuedas(){
        System.out.println("Quemando ruedas");
}
}