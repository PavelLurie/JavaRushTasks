package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner tre = new Scanner(System.in);
        int num1 = tre.nextInt(), num2 = tre.nextInt(), num3 = tre.nextInt();

        boolean comparison1 = (num1+num2)>num3;
        boolean comparison2 = (num2+num3)>num1;
        boolean comparison3 = (num1+num3)>num2;

        if (comparison1 && comparison2 && comparison3) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
