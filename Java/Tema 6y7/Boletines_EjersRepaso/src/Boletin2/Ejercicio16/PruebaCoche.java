package Boletin2.Ejercicio16;

public class PruebaCoche {
    public static void main(String[] args) {
        Concesionario miConcesionario = new Concesionario(10);

        // Insertamos algunos coches
        miConcesionario.insertarCoche("1234BBB", "Seat Ibiza", "TDI", 15000, "Rojo");
        miConcesionario.insertarCoche("5678CCC", "Tesla Model 3", "Eléctrico", 45000, "Blanco");

        // Listamos todos
        miConcesionario.listarCoches();

        // Consultamos la propiedad estática
        System.out.println("\nDinero total invertido en el concesionario: " + Coche.getPrecioTotal() + "€");

        // Obtener un coche específico
        Coche c = miConcesionario.obtenerCoche(1);
        System.out.println("\nCoche en la posición 1: " + (c != null ? c : "No existe"));
    }
}
