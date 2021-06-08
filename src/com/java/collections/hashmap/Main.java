package com.java.collections.hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Student> maps = new HashMap<>();
        maps.put(121,new Student(121,"sam","Python"));
        maps.put(122,new Student(122,"sam","dbms"));
        maps.put(123,new Student(123,"sam","java"));
        maps.put(124,new Student(124,"john","Python"));

        for(Integer value : maps.keySet()){
            System.out.println(maps.get(value));
        }

    }
}