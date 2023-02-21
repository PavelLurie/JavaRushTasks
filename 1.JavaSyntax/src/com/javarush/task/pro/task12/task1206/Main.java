package com.javarush.task.pro.task12.task1206;

public class Main {
    public static void main(String[] args) {
        /*
       boolean a = Character.isLetter('i');
        System.out.println(a);

         */

        String string = "Привет мир! Я написал хрень";
        int count = 0;
        String line = string.replaceAll("\\s","");
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (Character.isLetter(letter)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
