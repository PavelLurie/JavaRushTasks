package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(br.readLine());
        FileOutputStream fos = new FileOutputStream(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            int temp = fis.read();
            list.add(temp);
        }
        Collections.reverse(list);

        for (Integer reversBytes : list){
            fos.write(reversBytes);
        }

        fis.close();
        fos.close();
    }
}
