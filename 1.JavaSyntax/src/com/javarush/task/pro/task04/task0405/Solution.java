package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int  i = 0;
        while (i < 10) {

            if (i == 0 || i == 9) {
                int j = 0;
                while (j < 20) {
                    System.out.print("Б");
                    j++;
                }
            } else {
                int f = 0;
                while (f < 20) {
                    if (f == 0 || f == 19) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }

                    f++;
                }
            }

            System.out.println();
            i++;
        }

    }
}