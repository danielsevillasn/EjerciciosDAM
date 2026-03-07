package Electrodomesticos;

public class PruebaElectrodomesticos {
    public static void main(String[] args) {
        // Creamos un horno de 2.5 kW
        Electrodomestico miHorno = new Electrodomestico("Horno", "Bosch", 2.5);
        
        System.out.println(miHorno.toString());
        
        int horas = 2;
        double precioKw = 0.15;
        
        System.out.println("Consumo en 2h: " + miHorno.getConsumo(horas) + " kW");
        System.out.println("Coste en 2h: " + miHorno.getCosteConsumo(horas, precioKw) + " €");
    }
}