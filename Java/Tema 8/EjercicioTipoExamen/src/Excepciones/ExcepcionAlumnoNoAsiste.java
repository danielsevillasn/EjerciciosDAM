package Excepciones;

/**
 * Excepcion propia alumno no asiste
 * 
 * @author Dani S
 */
public class ExcepcionAlumnoNoAsiste extends Exception {
    public ExcepcionAlumnoNoAsiste(String mensaje) {
        super(mensaje);
    }
}
