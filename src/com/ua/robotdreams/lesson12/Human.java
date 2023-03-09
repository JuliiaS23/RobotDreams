package com.ua.robotdreams.lesson12;

public class Human {
    private String gender;

    private int age;

    private static int totalNumberOfHumans;

    public static int getTotalNumberOfHumans() {
        return totalNumberOfHumans;
    }

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String male) {
        this.gender = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
