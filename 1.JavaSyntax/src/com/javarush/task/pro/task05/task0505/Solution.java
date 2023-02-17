package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int [] myArray = new int[20];

        if (number % 2 != 0) {

            for (int i = 0; i < number; i++) {
                myArray[i] = console.nextInt();
            }
            for (int i = 0; i < number; i++) {
                System.out.println(myArray[i]);
            }
        } else if (number % 2 == 0){
            // массив в обратном порядке
            for (int i = 0; i < number; i++) {
                myArray[i] = console.nextInt();
            }
            for (int i = 0; i < number; i++){
                int k = myArray.length - number;
                System.out.println(myArray[19 - k - i]);
            }
        }
    }
}
