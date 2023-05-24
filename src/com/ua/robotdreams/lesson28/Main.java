package com.ua.robotdreams.lesson28;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String dataToSave = "Hello World!!!";
        String fileName = "data.txt";
        saveToFile(dataToSave, fileName);
        String dataFromFile = readFromFile(fileName);
        System.out.println("Data from file: " + dataFromFile);
    }
    public static void saveToFile(String data, String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            Files.writeString(filePath, data);
            System.out.println("Data successfully saved to file " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving data to a file " + fileName);
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            byte[] fileBytes = Files.readAllBytes(filePath);
            return new String(fileBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("An error occurred while reading data from the file " + fileName);
            e.printStackTrace();
        }
        return "";
    }
}

