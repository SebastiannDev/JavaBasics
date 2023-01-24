package XML_JSON;

import java.io.File;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/XML_JSON/Example.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            try {
                /* Analizamos el documento */
                Document document = documentBuilder.parse(file);

                /* Obtenemos usuario y clave: */
                String user = document.getElementsByTagName("user").item(0).getTextContent();
                String pass = document.getElementsByTagName("password").item(0).getTextContent();

                /* mostramos user y pass */
                System.out.println("Usuario: " + user + ", Clave: " + pass);

            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
