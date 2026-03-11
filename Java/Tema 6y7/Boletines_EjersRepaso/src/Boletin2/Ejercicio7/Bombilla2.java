public class Bombilla2 {
    // Atributos de instancia (cada bombilla tiene los suyos)
    private String id;
    private double potencia;
    private boolean encendida;

    // Atributo estático (compartido por todas las bombillas)
    private static double potenciaTotalConsumida = 0;

    public Bombilla2(String id, double potencia) {
        this.id = id;
        this.potencia = potencia;
        this.encendida = false; // Por defecto nacen apagadas
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            potenciaTotalConsumida += potencia;
            System.out.println("Bombilla " + id + " encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            potenciaTotalConsumida -= potencia;
            System.out.println("Bombilla " + id + " apagada.");
        }
    }

    // Método estático para obtener el consumo global
    public static double getPotenciaTotalConsumida() {
        return potenciaTotalConsumida;
    }
}