package com.ua.robotdreams.lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> surnamesMap = new ArrayList<>();
        String[] surnames = new String[]{"Zelenskiy", "Subota", "Poroshenko", "Podoliak"};
        for (int i = 0; i < 5; i++) {
            surnamesMap.addAll(List.of(surnames));
        }

        Map<String, Long> map = surnamesMap.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.forEach((surname, count) -> System.out.println(surname + ": " + count));

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            randomNumbers.add(random.nextInt(50));
        }
        int sum = randomNumbers.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum of random numbers: " + sum);


    }
}
