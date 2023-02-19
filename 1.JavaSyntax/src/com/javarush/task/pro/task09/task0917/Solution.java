package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String lineFirst = first.intern();
        String lineSecond = second.intern();


        if (lineFirst == lineSecond){
            return true;
        } else {
            return false;
        }

    }
}

/*
String t1 = a.intern();
String t2 = b.intern();
System.out.println(a == b);
System.out.println(t1 == t2);
 */