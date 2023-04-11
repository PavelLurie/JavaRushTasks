package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.ArrayList;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());

        ArrayList<Integer> listBytes = new ArrayList<>();

        while (fis.available() > 0){
            int bytes = fis.read();
            listBytes.add(bytes);
        }

        int count = 0;
        int t = ',';
        for (Integer temp : listBytes){
            if (temp == t){
                count++;
            }
        } System.out.println(count);
        fis.close();
    }
}
