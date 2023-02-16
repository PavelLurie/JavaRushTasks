package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        int x = per.nextInt(), y = per.nextInt();

        boolean comparison1 = x>0 && y>0;
        boolean comparison2 = x<0 && y>0;
        boolean comparison3 = x<0 && y<0;
        boolean comparison4 = x>0 && y<0;

        if (comparison1) {
            System.out.print("1");
        } else if (comparison2) {
            System.out.print("2");
        } else if (comparison3) {
            System.out.println("3");
        } else if (comparison4) {
            System.out.println("4");
        }
    }
}
