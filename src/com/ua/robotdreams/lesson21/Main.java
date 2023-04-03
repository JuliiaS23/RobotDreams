package com.ua.robotdreams.lesson21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", 4.4));
        studentList.add(new Student("Sasha",3.5));
        studentList.add(new Student("Dmytro", 2.5));
        studentList.add(new Student("Nazar",4.8));
        studentList.add(new Student("Olena", 5.0));
        studentList.add(new Student("Sofia",3.7));

        System.out.println("Unsorted: ");
        for (Student student : studentList) System.out.println(student);

        var sortedStudentsByGrade = studentList.stream()
                .sorted()
                .toList();

        System.out.println("Sorted by grade: ");
        for (Student student : sortedStudentsByGrade) System.out.println(student);

        var sortedStudentsByMame = studentList.stream()
                .sorted(new StudentByNameComparator())
                .toList();

        System.out.println("Sorted by name: ");
        for (Student student : sortedStudentsByMame) System.out.println(student);
    }
}
