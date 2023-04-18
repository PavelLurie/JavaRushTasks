package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
        BufferedReader br3 = new BufferedReader(new FileReader(file3))) {

            String line2 = br2.readLine();
            String line3 = br3.readLine();

            File writer = new File(file1);
            try (PrintWriter fw = new PrintWriter(writer)) {
                fw.append(line2).append(line3);
            }
        }



    }
}
