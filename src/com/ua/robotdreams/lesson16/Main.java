package com.ua.robotdreams.lesson16;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List <Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            list2.add(i);
        }

        MyArrayList<Student> myArrayList = new MyArrayList<>();
        myArrayList.add(new Student("Alex"));
        myArrayList.add(new Student("Sarah"));
        myArrayList.add(new Student("Dick"));
        myArrayList.add(new Student("Daniel"));
        myArrayList.add(new Student("Rob"));
        System.out.println(myArrayList);
    }



}
