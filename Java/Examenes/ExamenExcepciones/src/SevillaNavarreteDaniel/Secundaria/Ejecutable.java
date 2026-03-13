package SevillaNavarreteDaniel.Secundaria;

import SevillaNavarreteDaniel.Clases.*;
import SevillaNavarreteDaniel.Enum.ZonaReparto;
import SevillaNavarreteDaniel.Excepciones.ExcepcionesEmpleado;

// Plantilla inicio clase
/**
 * Clase que ejecuta el flujo del programa
 * 
 * @author Dani S
 */
public class Ejecutable {

    public static void ejecutar() throws ExcepcionesEmpleado {
        boolean salir = false;
        int opcion = -1;
        int opcion1 = -1;
        int opcion2 = -2;
        boolean datoValido = false;
        Empleado[] empleadosEmpresa = new Empleado[4];
        while (!salir) {
            opcion = Salida.menu("menu", "Vendedor", "Repartidor");
            switch (opcion) {

                // Salir
                case 0:
                    salir = true;
                    break;

                // Vendedores
                case 1:
                    opcion1 = Salida.menu("Vendedores", "Alta Vendedor", "Sube Porcentajes Sueldos",
                            "Consulta Vendedores");
                    switch (opcion1) {
                        case 1:
                            datoValido = false;
                            do {
                                try {
                                    String nombre = Entrada.pedirCadena("Dame el nombre del vendedor: ");
                                    int edad = Entrada.pedirEntero("Dame la edad del vendedor: ");
                                    double salarioMensual = Entrada
                                            .pedirDouble("Dame el salario mensual del vendedor: ");
                                    double comision = Entrada.pedirDouble("Dame la comision del vendedor: ");
                                    empleadosEmpresa[Empleado.getIdIncrementado()] = new Vendedor(nombre, edad,
                                            salarioMensual, comision);
                                    System.out.println("\nEmpleado creado correctamente");
                                    datoValido = true;
                                } catch (ExcepcionesEmpleado e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (!datoValido);
                            break;
                        case 2:
                            datoValido = false;
                            do {
                                try {
                                    int idEmpleado = Entrada
                                            .pedirEntero("Dame el id del vendedor que le quieres subir el sueldo: ");
                                    double porcentaje = Entrada.pedirDouble("Dame cuanto porciento quieres subirle: ");
                                    empleadosEmpresa[idEmpleado].subePorcentajeSueldos(porcentaje);
                                    System.out.println("\nSalario incrementado correctamente");
                                    datoValido = true;
                                } catch (NullPointerException e) {
                                    System.out.println("No hay ningun empleado asignado a ese id");
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    System.out.println("Sobre pasa el numero de empleados de la empresa");
                                }
                            } while (!datoValido);
                            break;
                        case 3:
                            for (int i = 0; i < empleadosEmpresa.length; i++) {
                                if (empleadosEmpresa[i] instanceof Vendedor && empleadosEmpresa[i] != null) {
                                    System.out.println(empleadosEmpresa[i]);
                                }
                            }
                            System.out.println("El sueldo mensual de la empresa es: "+Empleado.getSalarioMensualTotal());
                            break;
                        default:
                            break;
                    }
                    Salida.pausar();
                    Salida.limpiarPantalla();
                    break;

                // Repartidores
                case 2:
                    opcion2 = Salida.menu("Repartidores", "Alta Repartidor", "Sube Porcentajes Sueldos",
                            "Consulta Repartidores");
                    switch (opcion2) {
                        case 1:
                            datoValido = false;
                            do {
                                try {
                                    String nombre = Entrada.pedirCadena("Dame el nombre del repartidor: ");
                                    int edad = Entrada.pedirEntero("Dame la edad del repartidor: ");
                                    double salarioMensual = Entrada
                                            .pedirDouble("Dame el salario mensual del repartidor: ");
                                    int nZona = Entrada.pedirEntero("Dame el numero de la zona: ");
                                    if(nZona >= 0 && nZona<=2){
                                        ZonaReparto zona= ZonaReparto.values()[nZona];
                                        empleadosEmpresa[Empleado.getIdIncrementado()] = new Repartidor(nombre, edad,
                                                salarioMensual, zona);
                                        System.out.println("\nEmpleado creado correctamente");
                                        datoValido = true;
                                    }else{
                                        System.out.println("El numero de la zona no es valido");
                                    }
                                } catch (ExcepcionesEmpleado e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (!datoValido);
                            break;
                        case 2:
                            datoValido = false;
                            do {
                                try {
                                    int idEmpleado = Entrada
                                            .pedirEntero("Dame el id del repartidor que le quieres subir el sueldo: ");
                                    double porcentaje = Entrada.pedirDouble("Dame cuanto porciento quieres subirle: ");
                                    empleadosEmpresa[idEmpleado].subePorcentajeSueldos(porcentaje);
                                    System.out.println("\nSalario incrementado correctamente");
                                    datoValido = true;
                                } catch (NullPointerException e) {
                                    System.out.println("No hay ningun empleado asignado a ese id");
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    System.out.println("Sobre pasa el numero de empleados de la empresa");
                                }
                            } while (!datoValido);
                            break;
                        case 3:
                            for (int i = 0; i < empleadosEmpresa.length; i++) {
                                if (empleadosEmpresa[i] instanceof Repartidor && empleadosEmpresa[i] != null) {
                                    System.out.println(empleadosEmpresa[i]);
                                }
                            }
                            System.out.println("El sueldo mensual de la empresa es: "+Empleado.getSalarioMensualTotal());
                            break;
                        default:
                            break;
                    }
                    Salida.pausar();
                    Salida.limpiarPantalla();
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido");
                    break;
            }
        }
    }
}
