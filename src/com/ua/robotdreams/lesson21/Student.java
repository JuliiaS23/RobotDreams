package com.ua.robotdreams.lesson21;

public class Student implements Comparable<Student>{
    String name;
    double gradePointAverage;

    public Student(String name, double gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(gradePointAverage, o.gradePointAverage);
    }

    @Override
    public String toString() {
        return "Name: " + name + " GPA: " + gradePointAverage;
    }
}
