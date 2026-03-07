/**
 * @author inma
 * @version 1.0
 */
package EjemploAula.HerenciaInterfaces.Ej2VehiculoAbs;

/**
 * @author inma
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		
		Coche toyota = new Coche("Toyota");
		Coche ferrari = new Coche("Ferrari");
		Bicicleta bmx = new Bicicleta(2, 200);

		toyota.anda(199);
		ferrari.anda(300);
		toyota.truco();
		System.out.println("Km recorridos por el Toyota: "+toyota.getKmRecorridos());
		System.out.println("Km recorridos entre todos los vehiculos: "+  Vehiculo.getKilometrosTotales());
		System.out.println("Se han creado un total de "+ Vehiculo.getVehiculosCreados()+" Vehiculos");
	}	
}
