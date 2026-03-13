package SevillaNavarreteDaniel.Clases;

import SevillaNavarreteDaniel.Enum.ZonaReparto;
import SevillaNavarreteDaniel.Excepciones.ExcepcionesEmpleado;

/**
 * Clase Repartidor heredada de Empleado.
 * 
 * @author Dani S
 */
public class Repartidor extends Empleado {
    // Atributos/////////////////////
    private ZonaReparto zonasReparto;

    // Metodos////////////////////////

    // Constructor por defecto
    public Repartidor() {
        super();
        zonasReparto = ZonaReparto.ZONA1;
    }

    // Constructor para instanciar objeto con varios parametros
    public Repartidor(String nombre, int edad, double salarioMensual, ZonaReparto zonasReparto)
            throws ExcepcionesEmpleado {
        super(nombre, edad, salarioMensual);
        this.zonasReparto = zonasReparto;
        cobraPlus();
        if (!(salarioMensual >= 900 && salarioMensual <= 2000)) {
            throw new ExcepcionesEmpleado(
                    "El sueldo mensual del repartidor debe estar entre 900euros y 2000euros, ambos inclusive");
        }
    }

    // Getter
    public ZonaReparto getZonasReparto() {
        return zonasReparto;
    }

    // Setter
    public void setZonasReparto(ZonaReparto zonasReparto) {
        this.zonasReparto = zonasReparto;
    }

    // Otros metodos
    /**
     * Para repartidores, si tienen menos de 25 años y reparten en la ZONA3,
     * recibirán el
     * PLUS. (También actualiza el salario mensual de empresa).
     */
    public void cobraPlus() {
        double salarioMensual = getSalarioMensual();
        if ((getEdad() > 25) && (zonasReparto == ZonaReparto.ZONA3)) {
            setSalarioMensual(salarioMensual + getPLUS() + 150);
            double salarioMensualTotalActual = getSalarioMensualTotal();
            setSalarioMensualTotal(salarioMensualTotalActual+getSalarioMensual());
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString()+" Repartidor [zonasReparto=" + zonasReparto + "]";
    }
}
