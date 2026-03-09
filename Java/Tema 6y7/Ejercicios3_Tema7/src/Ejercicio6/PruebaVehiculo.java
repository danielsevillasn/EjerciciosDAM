package Ejercicio6;

public class PruebaVehiculo {
    public static void main(String[] args) {
        
        // Creo varias instancias de vehiculos
        Vehiculo v1 = new Vehiculo("Seat", "Ibiza");
        Coche c1 = new Coche("Toyota", "auris",4);
        Moto m1 = new Moto("Honda", "Superior",true);
        CocheDeportivo cd1 = new CocheDeportivo("ferrari", "maximus",2,true);
        
        // Muestro su informacion
        System.out.println(v1);
        System.out.println(c1);
        System.out.println(m1);
        System.out.println(cd1);
    }
}
