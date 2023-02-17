package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cola = console.nextInt();
        int prog = console.nextInt();
        
        double i = cola * 1.0/prog;
        System.out.println(i);

    }
}