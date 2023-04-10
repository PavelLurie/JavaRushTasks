package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);
        int min_byte = Integer.MAX_VALUE;
        while (inputStream.available() > 0){
            int next_byte = inputStream.read();
            if (min_byte > next_byte){
                min_byte = next_byte;
            } else if (min_byte == next_byte) {
                break;
            }
        }
        inputStream.close();
        System.out.println(min_byte);
    }
}
