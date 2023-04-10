package com.ua.robotdreams.lesson19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

public class SetExercises {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

            for (int i = 0; i < 1000; i++) {
                int randomNumber = random.nextInt(50) + 1;
                hashSet.add(randomNumber);
                linkedHashSet.add(randomNumber);
                treeSet.add(randomNumber);
            }
        System.out.println("Hashset: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
