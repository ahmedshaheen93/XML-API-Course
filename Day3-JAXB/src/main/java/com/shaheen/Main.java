package com.shaheen;

import com.shaheen.demo.AddressType;
import com.shaheen.demo.ObjectFactory;
import com.shaheen.demo.PersonType;

import javax.xml.bind.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            JAXBContext context = JAXBContext.newInstance("com.shaheen.demo");
            Unmarshaller unmarsh = context.createUnmarshaller();

            JAXBElement JAXBPerson = (JAXBElement) unmarsh.unmarshal(new File("demo.xml"));

            PersonType personType = (PersonType) JAXBPerson.getValue();

            System.out.println("Person name=" + personType.getName());

            AddressType address = (AddressType) personType.getAddress().get(0);

            System.out.println("First Address:" +
                    "Street=" + address.getStreet() +
                    "Number=" + address.getNumber());
            // update data to new xml
            personType.setName("Khaled Mohamed");

            List<AddressType> addressList = personType.getAddress();
            addressList.clear();

            ObjectFactory factory = new ObjectFactory();
            AddressType newAddr = factory.createAddressType();
            newAddr.setStreet("Giza");
            newAddr.setNumber(5);
            addressList.add(newAddr);

            JAXBElement person = factory.createPerson(personType);
            Marshaller marsh = context.createMarshaller();
            marsh.setProperty
                    (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.marshal
                    (person, new FileOutputStream("output.xml"));


        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
