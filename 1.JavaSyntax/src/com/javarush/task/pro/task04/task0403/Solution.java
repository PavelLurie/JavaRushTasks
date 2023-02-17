package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        int sum1 = 0;
        Scanner wer = new Scanner(System.in);
        String num1 = "";

        while (!num1.equals("ENTER")) {
            num1 = wer.nextLine();
            if (!num1.equals("ENTER")){
                int num2 = Integer.parseInt(num1);
                sum1 += (num2 % 10);
            } else {
                System.out.println(sum1);
            }
        }

    }
}