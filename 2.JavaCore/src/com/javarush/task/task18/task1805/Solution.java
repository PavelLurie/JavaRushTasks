package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            int next_byte = inputStream.read();
            list.add(Integer.valueOf(String.valueOf(next_byte)));
        }
        inputStream.close();

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);

        for(Integer bytes : list){
            System.out.print(bytes + " ");
        }
    }
}
