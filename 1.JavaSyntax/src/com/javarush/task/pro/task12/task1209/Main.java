package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> primer = new ArrayList<>();
        ArrayList<String> primer1 = new ArrayList<>();

        primer.add("Гвинно");
        primer.add("Гунигерд");
        primer.add("Боргелейф");
        primer.add("Нифрод");
        primer.add("Альбиуф");
        primer.add("Иногрим");
        primer.add("Фриле");


        boolean containsElement = primer.contains(null);
        if (containsElement) {
            primer.set(primer.indexOf(null), null);
            //primer1.add(nul);
        }

        System.out.println(primer);
        System.out.println();
        System.out.println(primer1);


    }
}
