package com.shaheen;


import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

public class PrintXMl {

    public PrintXMl(Document document){
        System.out.println(document);
        NodeList childNodes = document.getChildNodes();

//        printNode(childNodes);
        printBackword(childNodes);

    }
    public void printNode(NodeList childNodes){
        int length = childNodes.getLength();
        for(int i = 0 ; i < length ; i++){
            printNode(childNodes.item(i).getChildNodes());
            System.out.println("NodeName ="+ childNodes.item(i).getNodeName());


            NamedNodeMap attributes = childNodes.item(i).getAttributes();
            if(attributes !=null){
                for(int j = 0 ; j <attributes.getLength() ; j++){
                    System.out.println("NodeName =" +attributes.item(j).getNodeName());
                    System.out.println("NodeValue =" +attributes.item(j).getNodeValue());
                }
            }
            System.out.println("TextContent =" +childNodes.item(i).getTextContent());
        }
    }
    public void printBackword(NodeList childNodes){
        int length = childNodes.getLength();
        for(int i = length -1  ; i >=0 ; i--){
            printNode(childNodes.item(i).getChildNodes());
            System.out.println("NodeName ="+ childNodes.item(i).getNodeName());


            NamedNodeMap attributes = childNodes.item(i).getAttributes();
            if(attributes !=null){
                for(int j = attributes.getLength()-1 ; j >=0 ; j--){
                    System.out.println("NodeName =" +attributes.item(j).getNodeName());
                    System.out.println("NodeValue =" +attributes.item(j).getNodeValue());
                }
            }
            System.out.println("TextContent =" +childNodes.item(i).getTextContent());
        }
    }
}
