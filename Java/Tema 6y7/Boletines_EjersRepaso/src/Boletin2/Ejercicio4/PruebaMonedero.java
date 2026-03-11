public class PruebaMonedero {
    public static void main(String[] args) {
        // 1. Creamos un monedero con 50 euros iniciales
        Monedero miCartera = new Monedero(50.0);
        
        // 2. Consultamos el disponible inicial
        System.out.println("Saldo inicial: " + miCartera.disponible() + "euros");

        // 3. Metemos dinero
        System.out.println("\n--- Ingresando dinero ---");
        miCartera.meterDinero(25.50);

        // 4. Intentamos sacar más de lo que hay
        System.out.println("\n--- Intentando sacar demasiado ---");
        miCartera.sacarDinero(100.0);

        // 5. Sacamos una cantidad válida
        System.out.println("\n--- Sacando una cantidad válida ---");
        miCartera.sacarDinero(30.0);

        // 6. Consulta final
        System.out.println("\nSaldo final en el monedero: " + miCartera.disponible() + "euros");
    }
}
