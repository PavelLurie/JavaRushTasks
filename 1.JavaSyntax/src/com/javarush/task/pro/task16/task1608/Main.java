package com.javarush.task.pro.task16.task1608;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2020, 3, 12);
        DayOfWeek date = birthDate.getDayOfWeek();

        System.out.println(date);
    }
}
