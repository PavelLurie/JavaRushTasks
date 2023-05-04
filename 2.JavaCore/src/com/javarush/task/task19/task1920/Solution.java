package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        while (br.ready()){
            String [] line = br.readLine().split(" ");
            String name = line[0];
            double value = Double.parseDouble(line[1]);
            if (!map.containsKey(name)){
                map.put(name, value);
            }else {
                map.put(name, value + map.get(name));
            }
        }

        double temp = 0;
        for (String key : map.keySet()){
            if (map.get(key) > temp){
                temp = map.get(key);
            }
        }

        TreeSet<String> treeSet = new TreeSet<>();
        for (String name : map.keySet()){
            if (temp == map.get(name)){
                treeSet.add(name);
            }
        }

        for (String rich : treeSet){
            System.out.println(rich);
        }

        br.close();
    }
}
