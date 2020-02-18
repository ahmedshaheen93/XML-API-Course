package com.shaheen;

import com.shaheen.message.*;

import javax.xml.bind.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance("com.shaheen.message");
            Unmarshaller unmarsh = context.createUnmarshaller();

            //message style
            Style style = new Style();
            style.setFill("WIGHT");
            style.setFillBackground("BLACK");
            style.setFontName("Arial");
            style.setFontFamily("Arial");
            style.setFontSize("12");
            style.setFontWeight("Bold");

            //message chatgroup
            ChatGroup chatGroup = new ChatGroup();
            chatGroup.setId(2);
            chatGroup.setName("my chat group");

            // message user form
            User user = new User();
            user.setFirstName("ahmed");
            user.setLastName("ahmed");
            user.setPhone("0100000000000");
            user.setChatGroups(chatGroup);

            // create new message
            Message message = new Message();
            message.setId(1);
            message.setMessageContent("my message");
            message.setUserFrom(user);
            message.setChatGroup(chatGroup);
            message.setStyle(style);

            JAXBElement<Message> messages = new ObjectFactory().createMessages(message);
            Marshaller marsh = context.createMarshaller();
            marsh.setProperty
                    (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.marshal
                    (messages, new FileOutputStream("message.xml"));

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
