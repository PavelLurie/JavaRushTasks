package com.javarush.task.task13.task1318;

import java.io.*;


/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream content = new FileInputStream(br.readLine());

        int i ;
        while ((i = content.read()) != -1){
            System.out.print((char) i);
        }
        br.close();
        content.close();
    }
}