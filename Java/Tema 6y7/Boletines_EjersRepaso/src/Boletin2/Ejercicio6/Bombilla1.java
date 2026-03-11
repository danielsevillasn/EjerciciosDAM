public class Bombilla1 {
    protected static boolean interruptorGeneral;
    private boolean encendida;

    public Bombilla1(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public static void activarFusibles() {
        interruptorGeneral = true;
    }

    public static void desactivarFusibles() {
        interruptorGeneral = false;
    }

    @Override
    public String toString() {
        if (interruptorGeneral) {
            return "Bombilla [encendida=" + encendida + "]";
        } else {
            return "Bombilla [encendida=" + false + "]";
        }
    }
}
