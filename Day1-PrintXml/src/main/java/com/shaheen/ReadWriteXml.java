package com.shaheen;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadWriteXml {
    public ReadWriteXml(){

    }
    public Document readSourceDocument(){
        Document document = null;
       try {
           DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
           /*File file = new File(this.getClass().getResource("/xml/father.xml").toString());*/
           File file = new File("father.xml");
            document = documentBuilder.parse(file);
       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (SAXException e) {
           e.printStackTrace();
       }
       return document;
    }

}
