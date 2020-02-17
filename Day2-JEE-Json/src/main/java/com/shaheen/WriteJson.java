package com.shaheen;

import com.shaheen.model.Address;
import com.shaheen.model.User;

import javax.json.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
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

        JsonObject jsonObject = createJsonObject(user);
        writeToJsonFile(jsonObject,"ahmed.json");
    }

    private void writeToJsonFile(JsonValue jsonObject,String path) {
        try {
            JsonWriter jsonWriter = Json.createWriter(new FileOutputStream(path));
            jsonWriter.write(jsonObject);
            jsonWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private JsonObject createJsonObject(User user) {
        JsonObject userJson = Json.createObjectBuilder()
                .add("id", user.getId())
                .add("name", user.getName())
                .add("age", user.getAge())
                .add("address", Json.createObjectBuilder()
                        .add("country", user.getAddress().getCountry())
                        .add("city", user.getAddress().getCity())
                        .add("street", user.getAddress().getStreet()).build()
                ).build();
        return userJson;

    }

    public void writeArray(List<User> users){
        List<JsonObject> jsonObjects = new ArrayList<>();
        for (User user : users){
            jsonObjects.add(createJsonObject(user));
        }
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (JsonObject jsonObject : jsonObjects){
            arrayBuilder.add(jsonObject);
        }
        JsonArray jsonArray = arrayBuilder.build();
        System.out.println(jsonArray);
        writeToJsonFile(jsonArray,"listUsers.json");
    }
}
