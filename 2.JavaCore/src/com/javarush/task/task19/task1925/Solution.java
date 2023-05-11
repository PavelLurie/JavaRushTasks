package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();

        while (br.ready()) {
            String[] mass = br.readLine().split(" ");
            for (String line : mass) {
                if (line.length() > 6) {
                    sb.append(","+ line);
                }
            }
        }
        bw.write(String.valueOf(sb.replace(0,1,"")));


        br.close();
        bw.close();

    }
}
