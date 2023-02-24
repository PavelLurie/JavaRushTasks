package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
   public int compare(Student student1, Student student2) {
        int result = student2.getAge() - student1.getAge();
        if (result < 0){
            return result;
        } else if (result > 0) {
            return result;
        } else{
            return 0;
        }

    }
}

