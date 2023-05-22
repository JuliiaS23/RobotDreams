package com.ua.robotdreams.lesson26;

public class NegativeNumberException extends Exception {
    protected int negativeNumber;

    public NegativeNumberException(String message, int negativeNumber) {
        super(message);
        this.negativeNumber = negativeNumber;
    }
}
