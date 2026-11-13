package EjerciciosClase;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Ejercicio38 {
    public static void main(String[] args) {
        try {
            File archivo = new File("xml\\CuentasBanco.xml");
            
            // Comprobamos si el fichero existe antes de leerlo
            if (!archivo.exists()) {
                System.out.println("El fichero 'CuentasBanco.xml' no existe. Ejecuta primero el programa que lo genera.");
                return;
            }

            // Cargar y parsear el documento XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivo);

            // Normalizar el documento XML
            document.getDocumentElement().normalize();
            System.out.println("========================================");

            // Obtener la lista de todos los nodos "cuenta"
            NodeList listaCuentas = document.getElementsByTagName("cuenta");

            for (int i = 0; i < listaCuentas.getLength(); i++) {
                Node nodo = listaCuentas.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    // Extraer los datos hijos de cada cuenta
                    String titular = elemento.getElementsByTagName("nombreTitular").item(0).getTextContent();
                    String numCuenta = elemento.getElementsByTagName("numCuenta").item(0).getTextContent();
                    String saldo = elemento.getElementsByTagName("saldo").item(0).getTextContent();

                    // Mostrar los datos por consola formateados
                    System.out.println("Cuenta #" + (i + 1));
                    System.out.println("• Titular   : " + titular);
                    System.out.println("• Nº Cuenta : " + numCuenta);
                    System.out.println("• Saldo     : " + saldo + " €");
                    System.out.println("----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}