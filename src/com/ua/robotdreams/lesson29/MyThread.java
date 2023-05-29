package com.ua.robotdreams.lesson29;

public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i < 10; i++) {
                System.out.println("Thread name is: " + Thread.currentThread().getName() + " i = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Tread was interrupted");
        }
    }
}
