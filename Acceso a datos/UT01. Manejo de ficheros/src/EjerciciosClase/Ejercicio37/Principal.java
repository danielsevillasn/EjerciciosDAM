package EjerciciosClase.Ejercicio37;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CuentaBanco> listaCuentas = new ArrayList<>();

        System.out.print("¿Cuántas cuentas bancarias deseas introducir? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        // 1. Recoger los datos por teclado y guardarlos en una lista
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Cuenta Bancaria " + (i + 1) + " ---");
            System.out.print("Introduce el nombre del titular: ");
            String titular = scanner.nextLine();

            System.out.print("Introduce el número de cuenta: ");
            String numCuenta = scanner.nextLine();

            System.out.print("Introduce el saldo inicial: ");
            double saldo = Double.parseDouble(scanner.nextLine());

            // Crear el objeto y añadirlo a la lista
            listaCuentas.add(new CuentaBanco(titular, numCuenta, saldo));
        }

        // 2. Generar el fichero XML CuentasBanco.xml
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();

            // Elemento raíz <cuentas>
            Element raiz = documento.createElement("cuentas");
            documento.appendChild(raiz);

            // Recorrer la lista de objetos para volcarlos al XML
            for (CuentaBanco cuenta : listaCuentas) {
                Element elemCuenta = documento.createElement("cuenta");

                // Elemento <nombreTitular>
                Element elemTitular = documento.createElement("nombreTitular");
                elemTitular.setTextContent(cuenta.getNombreTitular());
                elemCuenta.appendChild(elemTitular);

                // Elemento <numCuenta>
                Element elemNumCuenta = documento.createElement("numCuenta");
                elemNumCuenta.setTextContent(cuenta.getNumCuenta());
                elemCuenta.appendChild(elemNumCuenta);

                // Elemento <saldo>
                Element elemSaldo = documento.createElement("saldo");
                elemSaldo.setTextContent(String.valueOf(cuenta.getSaldo()));
                elemCuenta.appendChild(elemSaldo);

                // Añadir la cuenta al elemento raíz
                raiz.appendChild(elemCuenta);
            }

            // 3. Escribir y guardar el documento en el archivo físico CuentasBanco.xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Configurar propiedades para que el XML tenga saltos de línea e indentación legible
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("xml\\CuentasBanco.xml"));

            transformer.transform(source, result);
            System.out.println("\n[✔] Fichero 'CuentasBanco.xml' generado y guardado con éxito.");

        } catch (Exception e) {
            System.out.println("Error al generar el fichero XML: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}