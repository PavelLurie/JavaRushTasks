package com.javarush.task.pro.task06.task0603;

/* 
Любимое блюдо
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        String name = firstName;
        String surname = lastName;
        String meal = favouriteDish;
        printPersonInfo(name, surname, meal);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }
    
}
