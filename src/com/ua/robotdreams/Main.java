package com.ua.robotdreams;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max value of the range of the array: ");
        int maxValue = scanner.nextInt();
        arrayWithRandomNumbers(array, maxValue);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Min value is " + minValue(array));
        System.out.println("Max value is " + maxValue(array));
        System.out.println("Average value is " + averageValue(array));
        System.out.println("Total value is " + totalValue(array));
    }

    static void arrayWithRandomNumbers(int[] x, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(maxValue);
        }
    }

    static void validateArray(int[] x) {
        if (x == null) {
            throw new NullPointerException("The array was null.");
        }
        if (x.length == 0) {
            throw new IllegalArgumentException("The array had no items.");
        }
    }

    static int minValue(int[] x) {
        validateArray(x);
        int currentMin = x[0];
        for (int j : x) {
            if (currentMin > j)
                currentMin = j;
        }
        return currentMin;
    }

    static int maxValue(int[] x) {
        validateArray(x);
        int currentMax = x[0];
        for (int j : x) {
            if (currentMax < j)
                currentMax = j;
        }
        return currentMax;
    }

    static int averageValue(int[] x) {
        validateArray(x);
        int total = 0;
        for (int j : x) {
            total += j;
        }
        return total / x.length;
    }

    static int totalValue(int[] x) {
        validateArray(x);
        int total = 0;
        for (int j : x) {
            total += j;
        }
        return total;
    }
}





