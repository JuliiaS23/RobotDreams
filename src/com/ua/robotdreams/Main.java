package com.ua.robotdreams;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====TASK 1=====");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=====TASK 2=====");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("=====TASK 3=====");
        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("=====TASK 4=====");
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        while (n0 + n1 < 100) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}




