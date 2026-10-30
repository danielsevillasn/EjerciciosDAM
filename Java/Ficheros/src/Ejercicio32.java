import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

/**
 * Muestra el contenido de los coches del archivo concesionario.xml
 * 
 * Ejercicio32
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        try {
            DocumentBuilder constructor = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = constructor.parse(new File("xml/concesionario.xml"));
            document.getDocumentElement().normalize();

            System.out.println("Elemento raíz: " + document.getDocumentElement().getNodeName());

            NodeList coches = document.getElementsByTagName("coche");

            for (int i = 0; i < coches.getLength(); i++) {
                Node coche = coches.item(i);
                if (coche.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList listaChoches = coche.getChildNodes();
                    for (int j = 0; j < listaChoches.getLength(); j++) {
                        Node cocheHijo = listaChoches.item(j);
                        if (cocheHijo.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println(cocheHijo.getNodeName() + ": " + cocheHijo.getTextContent());
                        }

                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
