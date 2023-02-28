package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer>list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        int i;
        while (scanner.hasNextInt()) {
            i = scanner.nextInt();
            list.add(i);
        }
        br.close();
        fis.close();

        Collections.sort(list);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 == 0){
                System.out.println(list.get(j));
            }
        }
    }
}
