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
        super(nombre, edad, salarioMensual); // Primero el super (obligatorio)

        // Ahora validamos el sueldo del Vendedor
        if (!(salarioMensual >= 1800 && salarioMensual <= 4000)) {
            // ¡ERROR! Deshacemos lo que hizo el constructor de Empleado
            setnEmpleados(getnEmpleados() - 1);
            setSalarioMensualTotal(getSalarioMensualTotal() - salarioMensual);
            setIdIncrementado(getIdIncrementado() - 1); // Para no perder el ID

            throw new ExcepcionesEmpleado("Sueldo de vendedor no válido...");
        }

        this.zonasReparto = zonasReparto;
        cobraPlus();
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
        if ((getEdad() < 25) && (zonasReparto == ZonaReparto.ZONA3)) {
            setSalarioMensual(salarioMensual + getPLUS());
            double salarioMensualTotalActual = getSalarioMensualTotal();
            setSalarioMensualTotal(salarioMensualTotalActual+getPLUS());
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString()+" Repartidor [zonasReparto=" + zonasReparto + "]";
    }
}
