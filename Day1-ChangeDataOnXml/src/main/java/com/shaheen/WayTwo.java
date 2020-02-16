package com.shaheen;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class WayTwo {
    public WayTwo(){
        ReadWriteXml readWriteXml = new ReadWriteXml();

        Document document = readWriteXml.readSourceDocument();
        NodeList message = document.getElementsByTagName("message");

        for(int i = 0 ; i<message.getLength() ; i++){
            Node node = message.item(i);
            Text text = document.createTextNode("hello from my program =" + i);
            node.replaceChild(text ,node.getFirstChild());
        }

        readWriteXml.writeSourceDocument(document,"wayTwo.xml");
    }
}
