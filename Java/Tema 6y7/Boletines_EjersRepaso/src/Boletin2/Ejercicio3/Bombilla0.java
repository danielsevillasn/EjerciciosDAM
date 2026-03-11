public class Bombilla0 {
    // Atributo: true si está encendida, false si está apagada
    private boolean encendida;

    // Constructor: por defecto las bombillas suelen estar apagadas al fabricarse
    public Bombilla0() {
        this.encendida = false;
    }

    // Método para encender
    public void on() {
        this.encendida = true;
    }

    // Método para apagar
    public void off() {
        this.encendida = false;
    }

    // Método para consultar el estado (Getter)
    public boolean estaEncendida() {
        return encendida;
    }

    @Override
    public String toString() {
        return "Estado de la bombilla: " + (encendida ? "ENCENDIDA" : "APAGADA");
    }
}