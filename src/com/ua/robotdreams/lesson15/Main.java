package com.ua.robotdreams.lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter number of day: ");
        var scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();
        System.out.println();
        DayOfWeek dayOfWeek = getDayOfWeekByNumber(numberOfDay);
        System.out.println(dayOfWeek.name());
    }

    private static DayOfWeek getDayOfWeekByNumber(int number) throws Exception {
        return switch (number) {
            case 1 -> DayOfWeek.MONDAY;
            case 2 -> DayOfWeek.TUESDAY;
            case 3 -> DayOfWeek.WEDNESDAY;
            case 4 -> DayOfWeek.THURSDAY;
            case 5 -> DayOfWeek.FRIDAY;
            case 6 -> DayOfWeek.SATURDAY;
            case 7 -> DayOfWeek.SUNDAY;
            default -> throw new Exception("Unknown day of week!");
        };
    }
}
