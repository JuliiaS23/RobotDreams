package com.ua.robotdreams.lesson29;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
