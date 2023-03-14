package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    
    static {
        labels.put(3.3, "П");
        labels.put(3.4, "Пр");
        labels.put(3.5, "При");
        labels.put(3.6, "Прив");
        labels.put(3.7, "Приве");
    }



    public static void main(String[] args) {


        System.out.println(labels);
    }
}
