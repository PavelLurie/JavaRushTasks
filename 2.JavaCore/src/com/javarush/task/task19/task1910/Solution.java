package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));

        while (br1.ready()){
            bw.write(br1.readLine().replaceAll("\\p{P}", ""));
        }
        br.close();
        br1.close();
        bw.close();
    }
}
