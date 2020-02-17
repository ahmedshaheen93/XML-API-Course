package com.shaheen;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Stack;

public class MyParser extends DefaultHandler {
    StringBuilder attr = new StringBuilder() ;
    Stack<String> strings = new Stack<>();
    @Override
    public void startDocument() throws SAXException {
        System.out.println("start Document");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document");
        System.out.println(attr);
        while (!strings.empty()){
            System.out.print(strings.pop());
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String eleName ="<"+qName;
        attr.append(eleName);
        strings.push(eleName);
        if(attributes !=null){
            for (int i =  0 ; i<attributes.getLength() ; i++){
                String attrName =" "+attributes.getQName(i) +"=";
                String attrValue ="\""+attributes.getValue(i) +"\"";
                attr.append(attrName);
                attr.append(attrValue);
                strings.push(attrName);
                strings.push(attrValue);
            }
        }
        String endTag =">" ;
        attr.append(endTag);
        strings.push(endTag);


    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
      String endElement ="</"+qName + ">";
        attr.append(endElement);
        strings.push(endElement);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String charcters = new String(ch,start,length);
         attr.append(charcters);
         strings.push(charcters);
    }


}
