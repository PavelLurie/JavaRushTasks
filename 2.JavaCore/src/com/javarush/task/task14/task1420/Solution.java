package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        for (int j = 1; j <= a ; j++) {
            for (int i = 1; i <= b ; i++) {
                if (a % j == 0 && b % i == 0){
                    if (i == j){
                        result = i;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
