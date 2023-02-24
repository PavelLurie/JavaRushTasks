package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2){
        String name1 = mentor1.getName();
        String name2 = mentor2.getName();
        int result = name1.length() - name2.length();

        if (result != 0){
            return result;
        }  else {
            return 0;
        }
    }
}