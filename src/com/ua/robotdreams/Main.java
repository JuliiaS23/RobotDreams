package com.ua.robotdreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to bring to cube number: ");
        int number = scanner.nextInt();
        System.out.println(cubeNumber(number));
        System.out.print("Enter the number of stars to print: ");
        number = scanner.nextInt();
        printStars(number);
        System.out.print("Enter the number of symbols to print: ");
        number = scanner.nextInt();
        System.out.print("Enter the symbol to print: ");
        String symbol = scanner.next();
        printSymbolNumberTimes(number, symbol);
    }

    static int cubeNumber(int number) {
        return number * number * number;
    }
    static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    static void printSymbolNumberTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}




