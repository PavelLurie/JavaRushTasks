package com.javarush.task.pro.task12.task1215;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String glassTop     = "       🍷       ";
        String glassSecond  = "      🍷🍷      ";
        String glassThird   = "     🍷🍷🍷     ";
        String glassFourth  = "    🍷🍷🍷🍷    ";
        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);

        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }

        System.out.println(list);
    }
}
