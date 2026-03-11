public class PruebaCuentaCorriente {
    public static void main(String[] args) {
        // 1. Creamos dos cuentas
        CuentaCorriente cuenta1 = new CuentaCorriente("Ahorros Juan");
        CuentaCorriente cuenta2 = new CuentaCorriente("Gastos Maria");

        System.out.println("--- Inicio de operaciones ---");

        // 2. Realizamos imposiciones
        cuenta1.imposicion(500);
        cuenta2.imposicion(100);

        // 3. Probamos el reintegro
        cuenta1.reintegro(50);

        // 4. Realizamos el traspaso de cuenta1 a cuenta2
        System.out.println("\nRealizando traspaso...");
        cuenta1.traspaso(200, cuenta2);

        // 5. Mostramos estados finales
        System.out.println("\n--- Estado Final ---");
        System.out.println("Saldo de " + cuenta1.getNombre() + ": " + cuenta1.getSaldo() + "euros");
        System.out.println("Saldo de " + cuenta2.getNombre() + ": " + cuenta2.getSaldo() + "euros");
    }
}
