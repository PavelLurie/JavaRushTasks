package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);
        int max_byte = 0;
        while (inputStream.available() > 0){
            int next_byte = inputStream.read();
            if (max_byte < next_byte){
                max_byte = next_byte;
            } else if (max_byte == next_byte) {
                break;
            }
        }
        inputStream.close();
        System.out.println(max_byte);

    }
}
