package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
       Scanner console = new Scanner(System.in);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }


       for (int i = 0; i < strings.length; i++) {
           String line = strings[i];
           for (int j = i + 1; j < strings.length; j++) {
               if (line == null) {
                   break;
               }
                   if (line.equals(strings[j])) {
                       strings [j] = null;
                       strings [i] = null;

                   }
               }
           }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
