package com.java.collections.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Student> set = new HashSet<>();

        //Adding elements to HashSet

        set.add(new Student("Avinash", 121, "ECE"));

        set.add(new Student("Bharat", 101, "EEE"));

        set.add(new Student("Malini", 151, "Civil"));

        set.add(new Student("Suresh", 200, "IT"));

        set.add(new Student("Vikram", 550, "CS"));

        set.add(new Student("Bharat", 301, "IT"));

        set.add(new Student("Amit", 301, "IT"));           //duplicate element

        set.add(new Student("Bhavya", 872, "ECE"));

        set.add(new Student("Naman", 301, "CS"));        //duplicate element

        set.add(new Student("Samson", 565, "Civil"));

        //Iterating through HashSet

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
