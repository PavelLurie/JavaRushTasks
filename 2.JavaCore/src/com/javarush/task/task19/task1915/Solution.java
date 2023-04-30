package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream(br.readLine());

        PrintStream printStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        testString.printSomething();
        fos.write(baos.toString().getBytes());
        fos.close();
        br.close();
        String result = baos.toString();
        System.setOut(printStream);
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {

            System.out.println("it's a text for testing");
        }
    }
}

