package com.ua.robotdreams.lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] arr = new int[scanner.nextInt()];
        System.out.print("Enter max value of the range of the array: ");
        int maxValue = scanner.nextInt();
        ArrayUtilities utilities = new ArrayUtilities();
        utilities.arrayWithRandomNumbers(arr, maxValue);
        utilities.printArray(arr);
        utilities.sortArrayAscending(arr);
        utilities.printArray(arr);
        utilities.sortArrayDescending(arr);
        utilities.printArray(arr);



    }



}





