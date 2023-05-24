package com.ua.robotdreams.lesson27;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String dataToSave = "Hello World!";
        String fileName = "data.txt";
        saveToFile(dataToSave, fileName);
        String dataFromFile = readFromFile(fileName);
        System.out.println("Data from file: " + dataFromFile);
    }
    public static void saveToFile(String data, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data successfully saved in file " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving data to a file " + fileName);
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading data from the file " + fileName);
            e.printStackTrace();
        }
        return data.toString();
    }
}

