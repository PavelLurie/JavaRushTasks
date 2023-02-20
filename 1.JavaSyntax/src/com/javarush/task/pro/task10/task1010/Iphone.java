package com.javarush.task.pro.task10.task1010;

/*
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {

        this.model = model;
        this.color = color;
        this.price = price;

    }

    @Override
    public boolean equals(Object model) {
        if (this == model) return true;
        if (model == null || getClass() != model.getClass()) return false;
        Iphone iphone = (Iphone) model;
        return this.model == iphone.model && this.color == iphone.color && this.price == iphone.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);


        System.out.println(iphone1.equals(iphone2));
    }

}
