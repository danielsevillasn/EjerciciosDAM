package SevillaNavarreteDaniel.Excepciones;

/**
 * Clase EdadNoValida que hereda de Exception
 * 
 * @author Dani S
 */
public class ExcepcionConsultaVendedor extends Exception{
    // Constructor para instanciar una excepcion con un parametro
    public ExcepcionConsultaVendedor(String mensaje){
        super(mensaje);
    }
}
