package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
            while (br.ready()) {
                String[] mas = br.readLine().split(" ");
                for (String temp : mas) {
                    for (int i = 0; i < temp.length(); i++) {
                        if (Character.isDigit(temp.charAt(i))) {
                            bw.write(temp + " ");
                            break;
                        }
                    }
                }
            }
        }
    }
}
