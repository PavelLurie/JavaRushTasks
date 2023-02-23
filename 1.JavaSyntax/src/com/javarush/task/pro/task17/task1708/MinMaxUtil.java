package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.Arrays;

public class MinMaxUtil {
    public static int min (int a, int b) {
        return Math.min(a, b);
    }

    public static int min (int a, int b, int c) {
        int [] min = {a, b, c};
        Arrays.sort(min);
         return min[0];
    }

    public static int min (int a, int b, int c, int d) {
        int [] min = {a, b, c, d};
        Arrays.sort(min);
        return min[0];
    }

    public static int min (int a, int b, int c, int d, int e) {
        int [] min = {a, b, c, d, e};
        Arrays.sort(min);
        return min[0];
    }

    public static int max (int a, int b) {
        return Math.max(a, b);
    }

    public static int max (int a, int b, int c) {
        int [] max = {a, b, c};
        Arrays.sort(max);
        return max[max.length-1];
    }

    public static int max (int a, int b, int c, int d) {
        int [] max = {a, b, c, d};
        Arrays.sort(max);
        return max[max.length-1];
    }

    public static int max (int a, int b, int c, int d, int e) {
        int [] max = {a, b, c, d, e};
        Arrays.sort(max);
        return max[max.length-1];
    }
}
