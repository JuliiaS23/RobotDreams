package com.ua.robotdreams.lesson30;

public class Main {
    public static void main(String[] args) {
        NumberGeneratorThread thread = new NumberGeneratorThread();
        thread.start();
    }
}
