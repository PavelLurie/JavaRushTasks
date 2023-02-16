package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean comparison1 = num1 == num2 && num2 == num3 && num3 == num1;
        boolean comparison2 = num1 == num2;
        boolean comparison3 = num2 == num3;
        boolean comparison4 = num3 == num1;



        if (comparison1) {
            System.out.print(num1+" " +num2+" " +num3);
        } else if (comparison2) {
            System.out.print(num1+" " +num2);
        } else if (comparison3) {
            System.out.println(num2+ " " +num3);
        } else if (comparison4) {
            System.out.println(num3+ " " +num1);

        }
    }
}
