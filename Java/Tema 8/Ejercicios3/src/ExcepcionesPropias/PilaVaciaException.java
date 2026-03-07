public class PilaVaciaException extends Exception {
    public PilaVaciaException(String mensaje){
        super("Error: "+mensaje);
    }
}
