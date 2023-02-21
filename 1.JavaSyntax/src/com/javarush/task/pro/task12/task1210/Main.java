package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

    }
}
