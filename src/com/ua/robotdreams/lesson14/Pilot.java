package com.ua.robotdreams.lesson14;

public class Pilot extends Human{
    @Override
    public void drive() {
        System.out.println("I don't know how to drive");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a plane");
    }
}
