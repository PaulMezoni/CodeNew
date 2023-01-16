import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Base64;
import java.util.Objects;

public class DocumentToStringConverter {
    public static void main(String[] args) {
        // какая-то строка с XML содержимым
        String xmlString = "<?xml version=\"1.0\" " +
                "encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "\n<Developer id=\"1\">\n" +
                "<name>Andrew</name><age>25</age><position>Middle</position>" +
                "<language>Java</language></Developer>";

        // убираем переносы строк входной строки для компактного вывода
//        xmlString = xmlString.replaceAll("[\n\r]", "");
        Document doc = stringToDocument(xmlString);
        String str = documentToString(doc);

        System.out.println(str);
        String encodeToString64 = encodeToString64(str);
        System.out.println(encodeToString64);
        System.out.println(decodeIsByte64(encodeToString64));
    }

    public static String decodeIsByte64(String s) {
        byte[] decode = Base64.getDecoder().decode(s);
        return new String(decode);
    }

    public static String encodeToString64(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }

    // конвертируем XML Document в строку
    private static String documentToString(Document doc) {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transfObject;
        try {
            transfObject = tFactory.newTransformer();
            // здесь мы указываем, что хотим убрать XML declaration:
            // тег <?xml ... ?> и его содержимое
            transfObject.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transfObject.transform(new DOMSource(doc), new StreamResult(writer));

            // возвращаем преобразованный  в строку XML Document
            return writer.getBuffer().toString();
        } catch (TransformerException e) {
            e.printStackTrace();
        }finally {

        }

        return null;
    }

    // парсим строку в XML Document
    private static Document stringToDocument(String xmlStr) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = builderFactory.newDocumentBuilder();
            // парсим переданную на вход строку с XML разметкой
            return docBuilder.parse(new InputSource(new StringReader(xmlStr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
