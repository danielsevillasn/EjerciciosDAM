package EjerciciosPropuestosRepaso;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // creamos una instancia de DocumentBuilderFactory para construir el parser y
        // cargamos el documento con el método parse()
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("EjerciciosRepaso\\books.xml"));
            document.getDocumentElement().normalize();

            System.out.println("Elemento : "+
                    document.getDocumentElement().getNodeName());
            
            NodeList books = document.getElementsByTagName("book");

            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() == Node.ELEMENT_NODE) {
                    Element menuElement = (Element) book;
                    System.out.println("Elemento: "+book.getNodeName());
                    System.out.println("\tAtributo: " + book.getAttributes().item(0).toString());

                    Node title = menuElement.getElementsByTagName("title").item(0);
                    System.out.println("Elemento: "+title.getNodeName());
                    System.out.println("\tAtributo: " + title.getAttributes().item(0).toString());
                    System.out.println("\tContenido: " + title.getTextContent());

                    Node author = menuElement.getElementsByTagName("author").item(0);
                    System.out.println("Elemento: "+author.getNodeName());
                    System.out.println("\tContenido: " + author.getTextContent());

                    Node year = menuElement.getElementsByTagName("year").item(0);
                    System.out.println("Elemento: "+year.getNodeName());
                    System.out.println("\tContenido: " + year.getTextContent());

                    Node price = menuElement.getElementsByTagName("price").item(0);
                    System.out.println("Elemento: "+price.getNodeName());
                    System.out.println("\tContenido: " + price.getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
