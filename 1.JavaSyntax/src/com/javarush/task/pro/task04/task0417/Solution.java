package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ms = console.nextInt();
        double i = 3.6;
        
        int kmch = (int) Math.round(ms * i);
        System.out.println(kmch);
        

    }
}