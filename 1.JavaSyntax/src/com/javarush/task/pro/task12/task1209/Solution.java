package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;


/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {

        initEmployees();
        paySalary("Фриле");

    }

    public static void paySalary(String name) {
        boolean containsElement = waitingEmployees.contains(name);
        if (containsElement) {
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
            alreadyGotSalaryEmployees.add(name);
        }
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }
}
