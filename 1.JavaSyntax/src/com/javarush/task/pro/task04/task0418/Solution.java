package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean opt = console.nextBoolean();

        if (opt == true){
            int glass1 = (int) Math.ceil(glass);
            System.out.println(glass1);

        } else if (opt == false) {
            int glass2 = (int) Math.floor(glass);
            System.out.println(glass2);
        }

    }
}