package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);
        String a = str1.nextLine();
        String b = str1.nextLine();
        String c = str1.nextLine();
        
        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());

    }
}
