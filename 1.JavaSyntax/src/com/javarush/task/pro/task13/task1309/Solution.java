package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ольга", 5.0);
        grades.put("Joe", 4.5);
        grades.put("Mike", 3.0);
        grades.put("Jhon", 4.3);
        grades.put("Nik", 5.0);
    }
}
