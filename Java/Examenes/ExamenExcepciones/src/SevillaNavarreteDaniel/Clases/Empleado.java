package SevillaNavarreteDaniel.Clases;

import SevillaNavarreteDaniel.Excepciones.ExcepcionesEmpleado;
import SevillaNavarreteDaniel.Interfaz.Salarios;

/**
 * Clase Empleado (no instancia objetos e implementa la interfaz Salarios)
 * 
 * @author Dani S
 */
public abstract class Empleado implements Salarios {
    // Atributos/////////////////////
    private static int idIncrementado = 0;
    private int id;
    private String nombre;
    private int edad;
    private double salarioMensual;
    private static double salarioMensualTotal;
    private static int nEmpleados;
    private final int PLUS = 300;

    // Metodos////////////////////////

    // Constructor por defecto
    public Empleado() {
        id = 0;
        nombre = "";
        edad = 0;
        salarioMensual = 0;
    }

    // Constructor para instanciar objeto con varios parametros
    public Empleado(String nombre, int edad, double salarioMensual) throws ExcepcionesEmpleado{
        this.nombre = nombre;
        this.edad = edad;
        if (!(edad >= 18 && edad <= 65)) {
            throw new ExcepcionesEmpleado("La edad del empleado deber ser entre 18 y 65 años ambos inclusive.");
        }
        nEmpleados++;
        this.salarioMensual = salarioMensual;
        salarioMensualTotal += salarioMensual;
        id = idIncrementado++;
    }

    // Getter
    public static int getIdIncrementado() {
        return idIncrementado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public static double getSalarioMensualTotal() {
        return salarioMensualTotal;
    }

    public static int getnEmpleados() {
        return nEmpleados;
    }

    public int getPLUS() {
        return PLUS;
    }

    // Setter
    public static void setIdIncrementado(int idIncrementado) {
        Empleado.idIncrementado = idIncrementado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public static void setSalarioMensualTotal(double salarioMensualTotal) {
        Empleado.salarioMensualTotal = salarioMensualTotal;
    }

    public static void setnEmpleados(int nEmpleados) {
        Empleado.nEmpleados = nEmpleados;
    }

    // Otros metodos
    /**
     * incrementa el sueldo mensual de un
     * empleado en el porcentaje indicado. Actualiza el sueldo mensual de la empresa
     * 
     * @param porcentaje valor double
     */
    public void subePorcentajeSueldos(double porcentaje) {
        double dineroSubido = salarioMensual * (porcentaje / 100);
        salarioMensual = salarioMensual + dineroSubido;
        salarioMensualTotal +=dineroSubido;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado con id=" + id + " y nombre=" + nombre + " tiene una edad=" + edad + ", un salario mensual=" + salarioMensual
                + "euros";
    }
}
