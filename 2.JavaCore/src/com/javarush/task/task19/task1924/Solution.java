package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.*;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(12, "двенадцать");
        map.put(11, "одиннадцать");
        map.put(10, "десять");
        map.put(9, "девять");
        map.put(8, "восемь");
        map.put(7, "семь");
        map.put(6, "шесть");
        map.put(5, "пять");
        map.put(4, "четыре");
        map.put(3, "три");
        map.put(2, "два");
        map.put(1, "один");
        map.put(0, "ноль");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        Scanner scan = new Scanner(fr);
        int count = 0;
        while (scan.hasNextLine()) {
            String content = scan.nextLine();
            String[] mass = content.split("\\b");

            Set<Integer> integers = map.keySet();

            for (Integer a : integers) {
                String temp = String.valueOf(a);
                for (int i = 0; i < mass.length; i++) {
                    if (temp.equals(mass[i])) {
                        int temp1 = Integer.parseInt(temp);
                        String change = map.get(temp1);
                        mass[i] = change;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String line : mass){
                sb.append(line);
            }
            System.out.println(sb);
        }

        br.close();
        fr.close();

    }
}
