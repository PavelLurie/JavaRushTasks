package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int num1 = age.nextInt();
        boolean comparison = num1 < 20 || num1 > 60;
        
        if (comparison){
            System.out.println("можно не работать");
        }
    }
}
