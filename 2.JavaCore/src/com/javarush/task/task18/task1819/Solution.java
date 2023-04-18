package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line1 = br1.readLine();
            String line2 = br2.readLine();

            File writer = new File(file1);
            try (PrintWriter fw = new PrintWriter(writer)) {
                fw.append(line2).append(line1);
            }
        }

    }
}
