public class Timbre {
    private boolean activo = false;

    public void activar() {
        if (!activo) {
            activo = true;
            System.out.println("!!! [TIMBRE]: ¡RIIIIING! La temperatura es crítica. !!!");
        }
    }

    public void desactivar() {
        if (activo) {
            activo = false;
            System.out.println("... [TIMBRE]: Silencio. La temperatura se ha normalizado. ...");
        }
    }
}