package SevillaNavarreteDaniel.Excepciones;

/**
 * Clase EdadNoValida que hereda de Exception
 * 
 * @author Dani S
 */
public class ExcepcionEdadVendedor extends Exception {
    // Constructor para instanciar una excepcion con un parametro
    public ExcepcionEdadVendedor(String mensaje){
        super(mensaje);
    }

    /**
     * Método que mira si la edad es menor a 18 o mayor a 60
     * 
     * @param edad entero que representa la edad
     * @return mensaje a pasar por pantalla
     */
    public static String consultaEdad (int edad){
        if(edad <= 18){
            return "El vendedor debe ser mayor de edad: 18 años "+ExcepcionEdadVendedor.class;
        }else if(edad >= 60){
            return "El vendedor debe tener menos de 60 años "+ExcepcionEdadVendedor.class;
        }else{
            return "Eso no es una edad";
        }
    }
}
