public class PruebaBombilla2 {
    public static void main(String[] args) {
        // Creamos varias bombillas con distintas potencias
        Bombilla2 salon = new Bombilla2("Salón", 60.0);
        Bombilla2 cocina = new Bombilla2("Cocina", 100.0);
        Bombilla2 habitacion = new Bombilla2("Habitación", 40.0);

        System.out.println("Consumo inicial: " + Bombilla2.getPotenciaTotalConsumida() + "W");

        // Encendemos algunas
        salon.encender();
        cocina.encender();

        System.out.println("Consumo actual: " + Bombilla2.getPotenciaTotalConsumida() + "W");

        // Apagamos una y encendemos otra
        salon.apagar();
        habitacion.encender();

        System.out.println("Consumo final: " + Bombilla2.getPotenciaTotalConsumida() + "W");
    }
}
