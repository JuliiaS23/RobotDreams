package com.ua.robotdreams.lesson31;
import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }
}