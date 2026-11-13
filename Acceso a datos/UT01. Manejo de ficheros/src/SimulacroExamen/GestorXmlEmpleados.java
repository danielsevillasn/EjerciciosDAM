package SimulacroExamen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/** Clase responsable exclusivamente de crear y leer empleados.xml mediante DOM. */
public class GestorXmlEmpleados {
    private final File archivoXml;

    public GestorXmlEmpleados(File archivoXml) {
        this.archivoXml = archivoXml;
    }

    /** Convierte objetos Empleado en nodos DOM y guarda el documento en disco. */
    public void exportar(List<Empleado> empleados) throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document documento = builder.newDocument();
        Element raiz = documento.createElement("empleados");
        documento.appendChild(raiz);

        for (Empleado e : empleados) {
            Element empleado = documento.createElement("empleado");
            empleado.setAttribute("id", String.valueOf(e.getId()));
            crearHijo(documento, empleado, "apellido", e.getApellido());
            crearHijo(documento, empleado, "departamento", String.valueOf(e.getDepartamento()));
            crearHijo(documento, empleado, "salario", String.valueOf(e.getSalario()));
            raiz.appendChild(empleado);
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(documento), new StreamResult(archivoXml));
    }

    /** Crea una etiqueta hija con texto, por ejemplo <salario>1750.0</salario>. */
    private void crearHijo(Document documento, Element padre, String etiqueta, String texto) {
        Element hijo = documento.createElement(etiqueta);
        hijo.setTextContent(texto);
        padre.appendChild(hijo);
    }

    /** Lee el XML y devuelve únicamente los empleados del departamento pedido. */
    public List<Empleado> leerPorDepartamento(int departamentoBuscado) throws Exception {
        List<Empleado> resultado = new ArrayList<>();
        Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(archivoXml);
        NodeList nodos = documento.getElementsByTagName("empleado");

        for (int i = 0; i < nodos.getLength(); i++) {
            Element empleado = (Element) nodos.item(i);
            int departamento = Integer.parseInt(texto(empleado, "departamento"));
            if (departamento == departamentoBuscado) {
                resultado.add(new Empleado(Integer.parseInt(empleado.getAttribute("id")),
                    texto(empleado, "apellido"), departamento,
                    Double.parseDouble(texto(empleado, "salario"))));
            }
        }
        return resultado;
    }

    /** Evita repetir la expresión DOM larga para recuperar el texto de una etiqueta. */
    private String texto(Element padre, String etiqueta) {
        return padre.getElementsByTagName(etiqueta).item(0).getTextContent();
    }
}
