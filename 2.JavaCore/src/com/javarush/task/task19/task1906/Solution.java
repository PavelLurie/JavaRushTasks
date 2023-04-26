package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileReader fr = new FileReader(file1);
        FileWriter wr = new FileWriter(file2);

        List<Character> list = new ArrayList<>();

        while (fr.ready()){
            list.add((char) fr.read());
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 > 0){
                wr.write(list.get(i));
            }
        }

        fr.close();
        wr.close();

    }
}
