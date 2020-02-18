package com.shaheen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shaheen.model.Address;
import com.shaheen.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteJson {

    public WriteJson(){
        Address address = new Address( 2, "Egypt", "Cairo", "my street");
        User ahmed = new User(1, "ahmed", "26", address);
        writeObject(ahmed);

        List<User> userList = new ArrayList<>();

        Address address1 = new Address( 2, "Egypt", "Cairo", "my street");
        User use1 = new User(1, "ahmed", "26", address);
        Address address2 = new Address( 2, "Egypt", "Cairo", "my street");
        User user2 = new User(1, "ahmed", "26", address);
        Address address3 = new Address( 2, "Egypt", "Cairo", "my street");
        User user3 = new User(1, "ahmed", "26", address);
        Address address4 = new Address( 2, "Egypt", "Cairo", "my street");
        User user4 = new User(1, "ahmed", "26", address);

        userList.add(use1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        writeArray(userList);

    }

    public void writeObject(User user){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try {
            Writer writer = new FileWriter("user1.json");
            gson.toJson(user,writer);
            writer.flush(); //flush data to file   <---
            writer.close(); //close write          <---

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//
    public void writeArray(List<User> users){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try {
            Writer writer = new FileWriter("userList1.json");
            gson.toJson(users,writer);
            writer.flush(); //flush data to file   <---
            writer.close(); //close write          <---
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
