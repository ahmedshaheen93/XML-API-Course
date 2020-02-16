package com.shaheen;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreatXml {
    public CreatXml(){
        ReadWriteXml readWriteXml = new ReadWriteXml();

        Document document = readWriteXml.newSourceDocument();
        // root element
        Element father = document.createElement("Father");
        father.setAttribute("age","52");

        Element name = document.createElement("name");
        name.setTextContent("mohamed");

        Element child = document.createElement("child");
        child.setAttribute("age","26");
        child.setAttribute("name","ahmed");

        Element school = document.createElement("school");
        school.setTextContent("iti");
        child.appendChild(school);

        father.appendChild(name);

        father.appendChild(child);




        document.appendChild(father);


        readWriteXml.writeSourceDocument(document,"father.xml");


    }
}
