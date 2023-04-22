package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path;
        while(!(path = br.readLine()).equals("end")) {
            int index = Integer.parseInt(path.substring(path.lastIndexOf("t")+ 1));
            if (!map.containsKey(index)){
                map.put(index, path);
            }
        }
        for (String path1 : map.values()){
            String newPath = path1.substring(0, path1.lastIndexOf("."));
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newPath, true))){
                while (bis.available() > 0){
                    bos.write(bis.read());
                }
            }
        }
    }
}
