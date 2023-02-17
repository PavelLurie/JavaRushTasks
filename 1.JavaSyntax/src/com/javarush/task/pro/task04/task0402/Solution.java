package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int num = 10;

        while (num > 0) {
            System.out.println(name + text);
            num--;
        }

    }
}
