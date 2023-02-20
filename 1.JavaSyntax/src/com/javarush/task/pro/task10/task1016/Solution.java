package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        String name = city.getName();
        int temperature = city.getTemperature();
        System.out.println("В городе " + name + " сегодня температура воздуха " + temperature);

    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        //System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
        showWeather(city);
    }
}
