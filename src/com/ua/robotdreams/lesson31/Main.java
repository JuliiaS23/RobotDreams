package com.ua.robotdreams.lesson31;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<RandomNumberCallable> callables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            callables.add(new RandomNumberCallable());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futures = executorService.invokeAll(callables);
        List<Integer> numbers = new ArrayList<>();
        for (Future<Integer> future : futures) {
            numbers.add(future.get());
        }

        for (int i = 0; i < futures.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
