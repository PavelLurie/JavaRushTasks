package com.javarush.task.task18.task1803;

import java.io.*;
import java.sql.Array;
import java.util.*;


/* 
Самые частые байты
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

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer temp : list) {
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                map.put(temp, map.get(temp) + 1);
            }
        }

        Collection<Integer> value = map.values();
        ArrayList<Integer> key = new ArrayList<>();
        int g = 0;
        for (Integer s : value){
            if (g <= s){
                g = s;
                key.add(g);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < key.size(); i++) {
                if(entry.getValue() == g) {
                    System.out.print(entry.getKey() + " ");
                    break;
                }
            }

        }
    }
}
