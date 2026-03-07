public class TemperaturaFueraRangoException extends Exception{
    public TemperaturaFueraRangoException(String mensaje){
        super("Problema: "+mensaje);
    }
}
