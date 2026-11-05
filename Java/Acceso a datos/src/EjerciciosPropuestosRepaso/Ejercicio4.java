package EjerciciosPropuestosRepaso;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // creamos una instancia de DocumentBuilderFactory para construir el parser y
        // cargamos el documento con el método parse()
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("EjerciciosRepaso\\menu.xml"));
            // Elimina nodos vacios y combina adyacentes en caso de que los hubiera
            document.getDocumentElement().normalize();
            System.out.printf("Elemento raiz: %s %n",
                    document.getDocumentElement().getNodeName());
            // crea una lista con todos los nodos empleado
            NodeList menus = document.getElementsByTagName("menu");
            System.out.printf("Nodos empleado a recorrer: %d %n",
                    menus.getLength());
            // recorrer la lista de nodos. Por cada nodo se obtienen sus etiquetas y sus
            // valores
            for (int i = 0; i < menus.getLength(); i++) {
                // obtener un nodo empleado
                Node menu = menus.item(i);
                if (menu.getNodeType() == Node.ELEMENT_NODE) {
                    Element menuElement = (Element) menu;
                    System.out.println("\nPlato " + menu.getAttributes().item(0).toString());
                    NodeList platos = menuElement.getElementsByTagName("plato");
                    for (int j = 0; j < platos.getLength(); j++) {
                        Node plato = platos.item(j);
                        if (plato.getNodeType() == Node.ELEMENT_NODE) {
                            Element elemento = (Element) plato;
                            System.out.println("Plato " + elemento.getElementsByTagName("nombre").item(0).getTextContent()
                                    + " " + plato.getAttributes().item(0).toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
