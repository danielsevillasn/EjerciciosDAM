package SimulacroExamen;

import java.io.File;
import java.util.List;

/**
 * Clase de arranque: coordina el ejercicio, pero no guarda ni convierte datos.
 *
 * <p>Mapa de responsabilidades para el examen:</p>
 * <ul>
 *   <li>{@link Empleado}: representa un registro en memoria.</li>
 *   <li>{@link FicheroAleatorioEmpleados}: lee y escribe empleados.dat.</li>
 *   <li>{@link GestorXmlEmpleados}: exporta y consulta empleados.xml.</li>
 * </ul>
 */
public class SimulacroEmpleados {
    public static void main(String[] args) throws Exception {
        // File representa rutas. mkdirs crea "datos" si aún no existe.
        File carpeta = new File("datos");
        if (!carpeta.exists()) carpeta.mkdirs();
        System.out.println("Carpeta: " + carpeta.getAbsolutePath());
        System.out.println("¿Es directorio?: " + carpeta.isDirectory());

        File binario = new File(carpeta, "empleados.dat");
        File xml = new File(carpeta, "empleados.xml");
        FicheroAleatorioEmpleados fichero = new FicheroAleatorioEmpleados(binario);

        // 1) Crea los cinco registros iniciales.
        fichero.guardarIniciales();

        // 2) Lee el binario de forma secuencial.
        System.out.println("\n--- LISTADO DESDE EL BINARIO ---");
        mostrar(fichero.listar());

        // 3) seek permite saltar directamente al registro con id 2.
        System.out.println("\n--- CONSULTA DIRECTA: ID 2 ---");
        System.out.println(fichero.buscarPorId(2));

        // 4) El sexto registro se añade al final, sin modificar los anteriores.
        fichero.anadir(new Empleado(6, "Santos", 20, 1850.0));

        // 5) Convierte todos los datos a XML y comprueba el resultado con File.
        GestorXmlEmpleados gestorXml = new GestorXmlEmpleados(xml);
        gestorXml.exportar(fichero.listar());
        System.out.println("\nXML creado: " + xml.getAbsolutePath());
        System.out.println("¿Existe?: " + xml.exists() + " | Tamaño: " + xml.length() + " bytes");

        // 6) Vuelve a leer XML y filtra el departamento solicitado.
        System.out.println("\n--- DEPARTAMENTO 20 DESDE XML ---");
        mostrar(gestorXml.leerPorDepartamento(20));
    }

    /** Centraliza el formato de salida para no repetirlo en las demás clases. */
    private static void mostrar(List<Empleado> empleados) {
        for (Empleado empleado : empleados) System.out.println(empleado);
    }
}
