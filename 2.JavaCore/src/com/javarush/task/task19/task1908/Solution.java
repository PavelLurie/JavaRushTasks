package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new FileReader(br.readLine()));
        String fileName2 = br.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));

        while (br1.ready()){
            String content = br1.readLine();
            for (String line : content.split(" ")){
               try {
                   int number = Integer.parseInt(line);
                   //System.out.println(number);
                   bw.write(number + " ");

               }catch (NumberFormatException e){

               }
            }
        }
        br.close();
        br1.close();
        bw.close();
    }
}
