package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            String line1 = br1.readLine();

            String[] temp = line1.split(" ");
            ArrayList<String> resultList = new ArrayList<>();

            for (String temp1 : temp){
                double one = Double.parseDouble(temp1);
                int result = (int) Math.round(one);
                String lineResult = String.valueOf(result);
                resultList.add(lineResult);
            }

            File writer = new File(file2);
            try (PrintWriter pw = new PrintWriter(writer)) {
                for (String result : resultList){
                    pw.append(result).append(" ");
                }
            }
        }
    }
}
