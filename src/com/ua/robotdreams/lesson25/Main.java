package com.ua.robotdreams.lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Enter the number: ");
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                inputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Exception: wrong number format entered.");
            }
        }

        System.out.println("You enter the number: " + number);
    }
}