package Ejercicio3;

public class PruebaEmpleado {
    public static void main(String[] args) {

        try {
            Empresa empresa = new Empresa("123", "empresa1");

            Empleado empleado1 = new Empleado("12345678A", "Fernando", 34, Departamento.Informática, true, empresa);
            Empleado empleado2 = new Empleado("12345678B", "Fernando", 25, Departamento.direccion, false, empresa);

            System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
            System.out.println("Sueldo empleado 2: " + empleado2.calcularSueldo());

            Empleado.setSalarioBase(2000);

            System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
            System.out.println("Sueldo empleado 2: " + empleado2.calcularSueldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
