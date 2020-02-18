package com.shaheen;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shaheen.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadJson {
    public ReadJson(){
        readJsonFile("ahmed.json");
        Gson gson = new Gson();
        User user = gson.fromJson(readJsonFile("ahmed.json"), User.class);
        System.out.println("single user");
        System.out.println(user);
        User[] users = gson.fromJson(readJsonFile("userList1.json"), User[].class);
        System.out.println("array of users");
        for(User user1:users){
            System.out.println(user1);
        }
        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        List<User> userList = new Gson().fromJson(readJsonFile("userList1.json"), listType);
        System.out.println("list of users");
        for (User user1 : userList){
            System.out.println(user1);
        }

    }

    private String readJsonFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

        }catch (IOException e)
        {
            e.printStackTrace();
        }
        for(String line : lines){
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }


}
