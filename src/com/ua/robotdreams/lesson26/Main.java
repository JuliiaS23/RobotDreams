package com.ua.robotdreams.lesson26;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(square(-2));
        }
        catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.negativeNumber);
        }
    }

    public static int square(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number is less than 0", number);
        }

        return (int)Math.pow(number, 2);

    }
}
