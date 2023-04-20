package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path;
        while (!(path = br.readLine()).equals("exit")){
            new ReadThread(path).start();
        }

        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        public void run(){
            try (FileReader fr = new FileReader(fileName);){
                Map<Integer, Integer> map = new TreeMap<>();
                while (fr.ready()){
                    int c = fr.read();
                    if (!map.containsKey(c)){
                        map.put(c, 1);
                    }else {
                        map.put(c, map.get(c) + 1);
                    }
                }

                int maxValue = 0;
                for (Map.Entry<Integer, Integer> a : map.entrySet()){
                    int c = a.getValue();
                    if (maxValue < c ){
                        maxValue = c;
                    }
                }

                int minKey = 0;
                for (Map.Entry<Integer, Integer> a : map.entrySet()){
                    int g = a.getValue();
                    if (maxValue == g){
                        minKey = a.getKey();
                        break;
                    }
                }
                resultMap.put(fileName, minKey);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        }
    }

