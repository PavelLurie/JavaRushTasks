package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        do {
            line = br.readLine();
            if (line.contains(".") && checkingForDouble(line)) {
                Double value = Double.valueOf(line);
                print(value);
            } else if (checkingForShort(line)) {
                Short temp = Short.valueOf(line);
                print(temp);
            } else if (checkingForInteger(line)) {
                Integer temp = Integer.valueOf(line);
                print(temp);
            } else if (!line.equals("exit")){
                print(line);
            }
        }while (!line.equals("exit"));
    }

    public static void print(Double value) {

        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {

        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {

        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {

        System.out.println("Это тип Integer, значение " + value);
    }

    public static boolean checkingForDouble(String value){

        try {
            Double temp = Double.valueOf(value);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public static boolean checkingForShort(String value){
        try {
            Short temp = Short.valueOf(value);
            if (temp > 0 && temp < 128){
                return true;
            }

        }catch (Exception e){

        }return false;
    }

    public static boolean checkingForInteger(String value){
        try {
            Integer temp = Integer.valueOf(value);
            if (temp <= 0 || temp >= 128){
                return true;
            }
        }catch (Exception e){

        }return false;
    }
}
