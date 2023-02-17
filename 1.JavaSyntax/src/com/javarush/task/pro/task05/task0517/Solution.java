package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        double i = array.length / 2.0;
        double j = (int) Math.round(i);
        int g = (int) j;

        int [] array1 = Arrays.copyOfRange(array, 0, g); // меньшая часть
        int [] array2 = Arrays.copyOfRange(array,g, array.length); // бОльшая часть

        result[0] = new int[array1.length];
        result[1] = new int[array2.length];

        for (int d = 0; d < array1.length; d++) {
            result[0][d]= array1[d];
        }

        for (int d = 0; d < array2.length; d++) {
            result[1][d]=array2[d];
        }
        System.out.println(Arrays.deepToString(result));
    }
}
