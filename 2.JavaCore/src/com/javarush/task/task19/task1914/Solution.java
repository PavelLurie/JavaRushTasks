package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setOut(ps);
        testString.printSomething();
        String result = baos.toString();
        System.setOut(printStream);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(result.split(" ")));

        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(2));
        int c = 0;

        if (list.get(1).equals("+")){
            c = a + b;
        } else if (list.get(1).equals("-")) {
            c = a - b;
        } else if (list.get(1).equals("*")) {
            c = a * b;
        }

        System.out.println(a + " " + list.get(1) + " " + b + " " + "=" + " " + c);

    }

    public static class TestString {
        public void printSomething() {

            System.out.println("3 + 6 = ");
        }
    }
}

