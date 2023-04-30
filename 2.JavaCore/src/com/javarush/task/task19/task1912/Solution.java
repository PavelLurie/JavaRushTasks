package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        testString.printSomething();

        String result = baos.toString().replaceAll("te", "??");

        System.setOut(printStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {

            System.out.println("it's a text for testing");
        }
    }
}
