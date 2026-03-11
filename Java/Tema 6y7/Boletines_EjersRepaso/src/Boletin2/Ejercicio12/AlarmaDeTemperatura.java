public class AlarmaDeTemperatura {
    private double temperaturaLimite;
    private Timbre miTimbre;

    public AlarmaDeTemperatura(double limite, Timbre timbre) {
        this.temperaturaLimite = limite;
        this.miTimbre = timbre;
    }

    public void setLimite(double nuevoLimite) {
        this.temperaturaLimite = nuevoLimite;
        System.out.println("[ALARM]: Nuevo límite configurado a " + nuevoLimite + "ºC");
    }

    // El "Sensor" llamará a este método constantemente
    public void comprobarTemperatura(double tempActual) {
        System.out.println("Lectura actual: " + tempActual + "ºC");
        
        if (tempActual >= temperaturaLimite) {
            miTimbre.activar();
        } else {
            miTimbre.desactivar();
        }
    }
}