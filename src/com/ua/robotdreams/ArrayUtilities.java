package com.ua.robotdreams;

import java.util.Random;

public class ArrayUtilities {
    public void arrayWithRandomNumbers(int[] x, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(maxValue);
        }

    }
    public void sortArrayAscending (int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i; j++) {
                if ( j < x.length - 1 && x[j+1] < x[j]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
    public void sortArrayDescending (int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i; j++) {
                if ( j < x.length - 1 && x[j+1] > x[j] ) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
    public void printArray (int[] x) {
        for  (int j : x) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
