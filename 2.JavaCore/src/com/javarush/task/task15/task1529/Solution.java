package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static CanFly result;

    public static void reset() throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            result = (input.readLine()).equals("helicopter") ? new Helicopter() : new Plane(Integer.parseInt(input.readLine()));
        }catch (IOException ioe) {}
    }
}
