package SevillaNavarreteDaniel.Excepciones;

/**
 * Clase ExcepcionesEmpleado que hereda de Exception
 * 
 * @author Dani S
 */
public class ExcepcionesEmpleado extends Exception {
    // Constructor para instanciar una excepcion con un parametro
    public ExcepcionesEmpleado(String mensaje){
        super(mensaje);
    }
}
