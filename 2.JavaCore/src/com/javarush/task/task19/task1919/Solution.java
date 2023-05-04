package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while (br.ready()){
            String  line = br.readLine();
            String[] mass = line.split(" ");
            String name = mass[0];
            double value = Double.parseDouble(mass[1]);
            if (!map.containsKey(name)){
                map.put(name, value);
            }else {
                map.put(name, map.get(name) + value);
            }
        }

        for (String line : map.keySet()) {
            System.out.println(line + " " + map.get(line));
        }

        br.close();
    }
}

//            br.lines()
//                    .collect(Collectors
//                            .toMap(k -> k.split(" ")[0], k -> Double.parseDouble(k.split(" ")[1]),
//                                    Double::sum, TreeMap::new))
//                    .forEach((key, value) -> {System.out.println(key + " " + value);});