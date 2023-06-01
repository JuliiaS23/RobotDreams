package com.ua.robotdreams.lesson30;

public class NumberGeneratorThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    System.out.println("Thread interruption!");
                    break;
                }
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
