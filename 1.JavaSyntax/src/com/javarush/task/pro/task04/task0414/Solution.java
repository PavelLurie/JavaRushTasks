package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int i = console.nextInt();

        if (i >= 5){
            System.out.println(str);
        } else {
            do {
                i--;
                System.out.println(str);
            }
            while (i > 0 && i < 5); {
            }
        }

    }
}