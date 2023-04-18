package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int countAllSymbol = 0;
        int countAllSpace = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            String line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                countAllSymbol++;
            }

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' '){
                    countAllSpace++;
                }
            }

        }

        double result = (double) countAllSpace/(double) countAllSymbol * 100;
        System.out.println(String.format("%.2f", result));

    }
}
