package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    private static Exception FileNotFoundException;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            try (FileReader fr = new FileReader(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
