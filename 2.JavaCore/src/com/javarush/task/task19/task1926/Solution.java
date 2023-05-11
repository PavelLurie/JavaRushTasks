package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()){
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(scan.nextLine()).reverse());
        }
        br.close();
        fr.close();
    }
}
