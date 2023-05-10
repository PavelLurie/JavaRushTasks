package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        Scanner scan = new Scanner(fr);


        while (scan.hasNextLine()){
            int count = 0;
            String line = scan.nextLine();
            String[]mass = line.split(" ");

            for (String temp : mass){
                if (words.contains(temp)){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(line);
            }
        }
        br.close();
        fr.close();
    }
}
