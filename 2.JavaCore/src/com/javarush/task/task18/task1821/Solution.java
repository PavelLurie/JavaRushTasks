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
        try (FileReader fr = new FileReader(args[0])) {
            int content;
            Map<Character, Integer> map = new TreeMap<>();
            while ((content = fr.read()) != -1) {
                if (!map.containsKey((char)content)){
                    map.put((char) content, 1);
                }else {
                    map.put((char) content, map.get((char)content) + 1);
                }
            }

            for (Map.Entry<Character, Integer> a : map.entrySet()){
                System.out.println(a.getKey() + " " + a.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
