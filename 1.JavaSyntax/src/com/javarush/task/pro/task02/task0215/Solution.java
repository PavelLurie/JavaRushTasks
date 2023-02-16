package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num1.nextInt();
        int c = num1.nextInt();
        
        System.out.println((a + b + c)/3);

    }
}
