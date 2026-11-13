package EjerciciosClase;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Ejercicio36 {
    public static void main(String[] args) {
        try {
            // Cargar el fichero XML
            File archivo = new File("xml\\Empleados.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivo);

            // Normalizar el documento XML
            document.getDocumentElement().normalize();
            System.out.println("Elemento raíz: " + document.getDocumentElement().getNodeName());
            System.out.println("========================================");

            // Obtener la lista de todos los nodos "empleado"
            NodeList listaEmpleados = document.getElementsByTagName("empleado");

            for (int i = 0; i < listaEmpleados.getLength(); i++) {
                Node nodo = listaEmpleados.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    // Extraer los datos hijos de cada empleado
                    String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                    String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                    String dep = elemento.getElementsByTagName("dep").item(0).getTextContent();
                    String salario = elemento.getElementsByTagName("salario").item(0).getTextContent();

                    // Mostrar por consola
                    System.out.println("Empleado #" + (i + 1));
                    System.out.println("• ID       : " + id);
                    System.out.println("• Apellido : " + apellido);
                    System.out.println("• Dep      : " + dep);
                    System.out.println("• Salario  : " + salario + " €");
                    System.out.println("----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}