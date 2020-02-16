package com.shaheen;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.net.URL;

public class ReadWriteXml {
    public ReadWriteXml(){

    }
    public Document newSourceDocument(){
        Document document = null;
       try {
           DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();
       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       }
       return document;
    }
    public void writeSourceDocument(Document document , String path){
       try {
           TransformerFactory transformerFactory = TransformerFactory.newInstance();
           Transformer transformer = transformerFactory.newTransformer();

           DOMSource domSource = new DOMSource(document);
           StreamResult streamResult = new StreamResult(new File(path));
           transformer.setOutputProperty(OutputKeys.INDENT, "yes");
           transformer.transform(domSource,streamResult);
       } catch (TransformerConfigurationException e) {
           e.printStackTrace();
       } catch (TransformerException e) {
           e.printStackTrace();
       }
    }

}
