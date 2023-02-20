package com.javarush.task.pro.task10.task1001;

/* 
Создадим небоскреб
*/

public class Skyscraper {

    public String Skyscraper;
    public Skyscraper(){
        this.Skyscraper = "Небоскреб построен.";
        System.out.println(Skyscraper);
    }

    public static void main(String[] args) {
        Skyscraper Skyscraper = new Skyscraper();
    }
}
