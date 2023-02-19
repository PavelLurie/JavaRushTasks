package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
       int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < ints.length; i++) {
            a = Math.min(Math.min(ints[0], ints[1]), Math.min(ints[2], ints[3]));
            b = Math.min(Math.min(ints[4], ints[5]), Math.min(ints[6], ints[7]));
            c = Math.min(ints[8], ints[9]);
        }
        return Math.min(Math.min(a, b), c);
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            int num = console.nextInt();
            ints[i] = num;
        }

        return ints;
    }
}
