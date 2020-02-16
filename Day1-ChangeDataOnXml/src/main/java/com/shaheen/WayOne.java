package com.shaheen;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class WayOne {

    public WayOne(){
           ReadWriteXml readWriteXml = new ReadWriteXml();

           Document document = readWriteXml.readSourceDocument();
           NodeList message = document.getElementsByTagName("message");

           for(int i = 0 ; i<message.getLength() ; i++){
               Node node = message.item(i);
               node.setTextContent("hello from my program =" + i );
           }
           readWriteXml.writeSourceDocument(document,"wayOne.xml");

    }


}
