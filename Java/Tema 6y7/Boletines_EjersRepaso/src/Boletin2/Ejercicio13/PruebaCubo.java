public class PruebaCubo {
    public static void main(String[] args) {
        // Creamos dos cubos
        Cubo cubo1 = new Cubo(10, 8); // Grande, casi lleno
        Cubo cubo2 = new Cubo(5, 2);  // Pequeño, con algo de espacio

        System.out.println("ESTADO INICIAL:");
        System.out.println("Cubo 1: " + cubo1.getContenidoActual() + "/" + cubo1.getCapacidad() + "L");
        System.out.println("Cubo 2: " + cubo2.getContenidoActual() + "/" + cubo2.getCapacidad() + "L");

        // Intento 1: Verter el grande en el pequeño (se llenará el pequeño y sobrará en el grande)
        System.out.println("\n--- Vertiendo Cubo 1 en Cubo 2 ---");
        cubo1.verter(cubo2);
        
        System.out.println("Cubo 1 (origen): " + cubo1.getContenidoActual() + "L (deberían quedar 5L)");
        System.out.println("Cubo 2 (destino): " + cubo2.getContenidoActual() + "L (debería estar lleno a 5L)");

        // Intento 2: Verter lo que queda en un cubo nuevo vacío
        Cubo cubo3 = new Cubo(20, 0);
        System.out.println("\n--- Vertiendo lo que queda de Cubo 1 en Cubo 3 (vacío y grande) ---");
        cubo1.verter(cubo3);

        System.out.println("Cubo 1 (origen): " + cubo1.getContenidoActual() + "L (debería quedar 0L)");
        System.out.println("Cubo 3 (destino): " + cubo3.getContenidoActual() + "L (debería tener 5L)");
    }
}
