package com.ua.robotdreams.lesson14;

public class Main {
    public static void main(String[] args) {
        Human driver = new Driver();
        Human pilot = new Pilot();
        Human[] humans = new Human[]{ driver, pilot };
        for (Human human : humans) {
            System.out.println("----------");
            human.drive();
            human.fly();
        }
    }
}
