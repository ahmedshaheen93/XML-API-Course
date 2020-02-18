package com.shaheen;

import com.shaheen.model.Address;
import com.shaheen.model.User;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadJson {
    public ReadJson()
    {
        // read json file

        JsonStructure jsonStructure = readJsonFile("ahmed.json");
        JsonObject jsonObject = jsonStructure.asJsonObject();
        User user = convertToUser(jsonObject);
        System.out.println(user);


        List<User> users = new ArrayList<>();
        JsonStructure jsonStructureList = readJsonFile("listUsers.json");
        JsonArray jsonValues = jsonStructureList.asJsonArray();
        for(int i =  0 ; i<jsonValues.size() ; i++){
            JsonObject jsonObject1 = jsonValues.getJsonObject(i);
            User user1 = convertToUser(jsonObject);
            users.add(user1);
            System.out.println(user1);
        }

    }
    public JsonStructure readJsonFile(String path){
        try {
            File file = new File(path);
            FileInputStream fileInputStream = new FileInputStream(file);
            JsonReader jsonReader = Json.createReader(fileInputStream);
            JsonStructure read = jsonReader.read();
            return read;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public User convertToUser(JsonObject jsonObject){
        JsonObject addressJsonObject = jsonObject.getJsonObject("address");
        Address address = new Address(
                addressJsonObject.getInt("id")
                ,addressJsonObject.getString("country")
                ,addressJsonObject.getString("city")
                ,addressJsonObject.getString("street"));

        return new User(jsonObject.getInt("id"),jsonObject.getString("name"),
                jsonObject.getString("age"),
                address
        );
    }
}
