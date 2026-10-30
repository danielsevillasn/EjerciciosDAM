import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

import org.w3c.dom.*;

/**
 * Crea un documento XML con la siguiente estructura:
 * 
 * Ejercicio33
 */
public class Ejercicio33 {
    public static void main(String[] args) throws IOException{
        try{
            DocumentBuilder constructor = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            DOMImplementation implementacion = constructor.getDOMImplementation();
            Document documento = implementacion.createDocument(null, "cars", null);
            documento.setXmlVersion("1.0");

            Element elementoRaiz = documento.getDocumentElement();

            Element supercar = documento.createElement("supercars");
            elementoRaiz.appendChild(supercar);

            Attr company = documento.createAttribute("company");
            company.setValue("Ferrari");
            supercar.setAttributeNode(company);

            Element carname1 = documento.createElement("carname");
            carname1.setAttribute("type", "Formula one");
            carname1.appendChild(documento.createTextNode("Ferrari 101"));
            supercar.appendChild(carname1);

            Element carname2 = documento.createElement("carname");
            carname2.setAttribute("type", "sports");
            carname2.appendChild(documento.createTextNode("Ferrari 202"));
            supercar.appendChild(carname2);


            Transformer t = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult consoleResult = new StreamResult(new File("cars.xml"));
            t.transform(source, consoleResult);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
