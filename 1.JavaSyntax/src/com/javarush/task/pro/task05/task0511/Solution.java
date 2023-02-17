package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size1 = console.nextInt();
        multiArray = new int[size1][];
        int k;

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[k = console.nextInt()];
        }

        /*
        myArr [0] = new int[k = console.nextInt()];
        myArr [1] = new int[k = console.nextInt()];
        myArr [2] = new int[k = console.nextInt()];
        myArr [3] = new int[k = console.nextInt()];

         */

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {

                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
