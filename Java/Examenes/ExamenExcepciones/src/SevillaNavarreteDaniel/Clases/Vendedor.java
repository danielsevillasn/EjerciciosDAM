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
    public Vendedor(String nombre, int edad, double salarioMensual, double comision) throws ExcepcionesEmpleado {
        super(nombre, edad, salarioMensual); // Primero el super (obligatorio)

        // Ahora validamos el sueldo del Vendedor
        if (!(salarioMensual >= 1800 && salarioMensual <= 4000)) {
            // ¡ERROR! Deshacemos lo que hizo el constructor de Empleado
            setnEmpleados(getnEmpleados() - 1);
            setSalarioMensualTotal(getSalarioMensualTotal() - salarioMensual);
            setIdIncrementado(getIdIncrementado() - 1); // Para no perder el ID

            throw new ExcepcionesEmpleado("Sueldo de vendedor no válido...");
        }

        this.comision = comision;
        cobraPlus();
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
            setSalarioMensualTotal(salarioMensualTotalActual + getPLUS() + 150);
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " Vendedor [comision=" + comision + "]";
    }
}
