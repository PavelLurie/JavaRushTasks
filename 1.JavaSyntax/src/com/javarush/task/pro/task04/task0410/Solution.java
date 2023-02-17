package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;


        // минимума (min) < secMin <= остальных чисел (x)


                                                // тут мы получаем минимум
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                secMin = min;
                min = x;                       // получили минимум

            } else if (x < secMin && x != min) {
                secMin = x;
            }
        }
        if (secMin != Integer.MAX_VALUE) {
            System.out.println(secMin);
        } else {
            System.out.println();
        }

        System.out.println();

    }
}