package com.javarush.task.pro.task16.task1612;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, String> m1 = new HashMap<>();

        m1.put("1", "One");
        m1.put("2", "Two");
        m1.put("2a", "Two");

        System.out.println(m1);
        System.out.println();
        Set<Map.Entry<String, String>> g2 = new HashSet<>();
        g2 = m1.entrySet();


    }
}
