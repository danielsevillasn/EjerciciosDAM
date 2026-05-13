package SevillaNavarreteDaniel.Secundaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import SevillaNavarreteDaniel.Clases.Vendedor;
import SevillaNavarreteDaniel.Excepciones.ExcepcionConsultaVendedor;
import SevillaNavarreteDaniel.Excepciones.ExcepcionEdadVendedor;

/**
 * Clase flujo de aplicacion que controla como funciona la aplicacion
 * 
 * @author Dani S
 */
public class FlujoAplicacion {
    /**
     * Método que inicia la aplicacion
     */
    public static void inicio() {
        boolean salir = false;
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        File archivoLog = new File("./src/SevillaNavarreteDaniel/Log/log.txt");
        File archivoVendedores = new File("./src/SevillaNavarreteDaniel/Datos/vendedores.dat");
        while (!salir) {
            int opcion = Salida.menu("MENU", "Alta vendedor", "Consultar vendedores", "Mostrar log");
            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    altaVendedor(archivoVendedores, archivoLog, vendedores);
                    break;
                case 2:
                    consultaVendedor(archivoVendedores);
                    break;
                case 3:
                    mostrarLog(archivoLog);
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }

    /**
     * Método que primero revisa si hay vendedores y luego añade un vendedor al
     * archivo vendedores
     * 
     * @param archivoVendedores File que recibe el path del archivo
     * @param archivoLog        File que recibe el path del archivo
     */
    private static void altaVendedor(File archivoVendedores, File archivoLog, List<Vendedor> vendedores) {

        // Comprobacion de si hay o no vendedores en el fichero
        try{
            comprobacionVendedores(archivoVendedores);
        }catch(ExcepcionConsultaVendedor e){
            System.out.println(e.getMessage());
        }

        // Flujo de alta de vendedores
        Vendedor vendedor;
        boolean vendedorValido = false;

        while (!vendedorValido) {
            String nombre = Entrada.pedirCadena("Nombre del vendedor = ");
            String apellidos = Entrada.pedirCadena("Apellidos del vendedor = ");
            int edad = Entrada.pedirEntero("Edad del vendedor = ");

            try {
                vendedor = new Vendedor(nombre, apellidos, edad);
                vendedorValido = true;
                vendedores.add(vendedor);
                System.out.println("El vendedor ha sido dado de alta");
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoVendedores))) {
                    Collections.sort(vendedores);
                    oos.writeObject(vendedores);
                    oos.close();
                } catch (IOException e) {
                    System.out.println("No se reconoce el objeto");
                }
            } catch (ExcepcionEdadVendedor e) {
                System.out.println(ExcepcionEdadVendedor.consultaEdad(edad));
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoLog,true))) {
                    bw.write(DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mm:ss a").format(LocalDateTime.now())
                            + "\t " + ExcepcionEdadVendedor.consultaEdad(edad));
                    bw.close();
                } catch (IOException e1) {
                    System.out.println("No se reconoce el objeto");
                }
            }
        }

    }

    /**
     * Metodo que comprueba si hay vendedores dados de alta y si no los hay muestra
     * un mensaje por pantalla
     * 
     * @param archivoVendedores File que recibe el path del archivo
     * @throws ExcepcionConsultaVendedor 
     */
    private static void comprobacionVendedores(File archivoVendedores) throws ExcepcionConsultaVendedor {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoVendedores));
            ArrayList<Vendedor> v = (ArrayList<Vendedor>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al deserializar.");
        } catch (IOException e) {
            throw new ExcepcionConsultaVendedor("No hay vendedores aún, primero da de alta a vendedores");
        }
    }

    /**
     * Método que lee el archivo vendedores para previamente pasarlo por pantalla
     * ordenado
     * 
     * @param archivoVendedores File que recibe el path del archivo
     */
    private static void consultaVendedor(File archivoVendedores) {
        ArrayList<Vendedor> vendedoresActuales = null;

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoVendedores));
            vendedoresActuales = (ArrayList<Vendedor>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al deserializar.");
        } catch (IOException e) {
            System.out.println("Ya no hay más vendedores");
        }

        if (vendedoresActuales != null) {
            for (Vendedor v : vendedoresActuales) {
                System.out.println(v);
            }
        } else {
            System.out.println("No hay vendedores aún, primero da de alta a alguno");
        }
    }

    /**
     * Método que lee el archivo log para pasarlo por pantalla
     * 
     * @param archivoLog File que recibe el path del archivo
     */
    private static void mostrarLog(File archivoLog) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLog));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) { // Si no en cuentra el fichero
            System.out.println("No se encuentra el fichero log.txt");
        } catch (IOException ioe) {// Que hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero log.txt");
        }
    }
}
