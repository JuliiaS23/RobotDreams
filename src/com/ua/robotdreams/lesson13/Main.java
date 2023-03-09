package com.ua.robotdreams.lesson13;

public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        Human teacher = new Teacher();
        System.out.println(student.doWork());
        System.out.println(teacher.doWork());
    }
}
