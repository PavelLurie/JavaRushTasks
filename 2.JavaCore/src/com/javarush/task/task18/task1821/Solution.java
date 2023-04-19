package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}

//try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
//        String line = br.readLine();
//        Map<Character, Integer> map = new TreeMap<>();
//        for (char aChar : line.toCharArray()) {
//        if (!map.containsKey(aChar)) {
//        map.put(aChar, 1);
//        } else {
//        map.put(aChar, map.get(aChar) + 1);
//        }
//        }
//        for (Map.Entry<Character, Integer> a : map.entrySet()){
//        System.out.println(a.getKey() + " " + a.getValue());
//        }
//        }
