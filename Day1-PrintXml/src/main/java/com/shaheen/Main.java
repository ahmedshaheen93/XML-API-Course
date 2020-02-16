package com.shaheen;

public class Main {
    public static void main(String[] args) {
        ReadWriteXml readWriteXml = new ReadWriteXml();

        PrintXMl printXMl =
                new PrintXMl(readWriteXml.readSourceDocument());

    }
}
