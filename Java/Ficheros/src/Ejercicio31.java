import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

/**
 * Mostrar la información contenida en el documento clase.xml
 * 
 * Ejercicio31
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(new File("xml/clase.xml"));
            document.getDocumentElement().normalize();

            System.out.printf("Elemento raiz: %s %n",
                    document.getDocumentElement().getNodeName());

            NodeList clase = document.getElementsByTagName("alumno");
            System.out.printf("Nodos clase a recorrer: %d %n",
                    clase.getLength());

            for (int i = 0; i < clase.getLength(); i++) {
                Node alumno = clase.item(i);
                if (alumno.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) alumno;
                    System.out.printf("Nombre = %s %n",
                            elemento.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.printf(" * Apellido = %s %n",
                            elemento.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.printf(" * Apodo = %s %n",
                            elemento.getElementsByTagName("apodo").item(0).getTextContent());
                    System.out.printf(" * Marcas = %s %n",
                            elemento.getElementsByTagName("marcas").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
