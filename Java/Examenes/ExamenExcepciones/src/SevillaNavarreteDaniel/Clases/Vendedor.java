package SevillaNavarreteDaniel.Clases;

import SevillaNavarreteDaniel.Excepciones.ExcepcionesEmpleado;

/**
 * Clase Vendedor heredada de Empleado.
 * 
 * @author Dani S
 */
public class Vendedor extends Empleado {
    // Atributos/////////////////////
    private double comision;

    // Metodos////////////////////////

    // Constructor por defecto
    public Vendedor() {
        super();
        comision = 0;
    }

    // Constructor para instanciar objeto con varios parametros
    public Vendedor(String nombre, int edad, double salarioMensual, double comision) throws ExcepcionesEmpleado{
        super(nombre, edad, salarioMensual);
        this.comision = comision;
        cobraPlus();
        if (!(salarioMensual >= 1800 && salarioMensual <= 4000)) {
            throw new ExcepcionesEmpleado(
                    "El sueldo mensual del vendedor debe estar entre 1800euros y 4000euros, ambos inclusive");
        }
    }

    // Getter
    public double getComision() {
        return comision;
    }

    // Setter
    public void setComision(int comision) {
        this.comision = comision;
    }

    // Otros metodos
    /**
     * Para vendedores, si tienen más de 30 años y cobran una comisión de más de 200
     * euros,
     * se le aplicara el PLUS +150€. (También actualiza el salario mensual de
     * empresa)
     */
    public void cobraPlus() {
        double salarioMensual = getSalarioMensual();
        if ((getEdad() > 30) && (comision > 200)) {
            setSalarioMensual(salarioMensual + getPLUS() + 150);
            double salarioMensualTotalActual = getSalarioMensualTotal();
            setSalarioMensualTotal(salarioMensualTotalActual+getSalarioMensual());
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString()+" Vendedor [comision=" + comision + "]";
    }
}
