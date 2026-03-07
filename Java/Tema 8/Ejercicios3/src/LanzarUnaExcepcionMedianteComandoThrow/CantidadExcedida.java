package LanzarUnaExcepcionMedianteComandoThrow;

public class CantidadExcedida extends RuntimeException {
    public CantidadExcedida(String message) {
        super(message);
    }
}
