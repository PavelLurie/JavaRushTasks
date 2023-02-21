package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        String line = string.replaceAll("\\s","");
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (Character.isDigit(letter)) {
                count ++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        String line = string.replaceAll("\\s","");
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (Character.isLetter(letter)) {
                count ++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (Character.isSpaceChar(letter)) {
                count ++;
            }
        }
        return count;
    }
}
