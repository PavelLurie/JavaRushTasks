package com.javarush.task.task14.task1415;
public class Draft {
    public static void main(String[] args) {
        Animal animal = new Tiger();

        ((Tiger) animal).run();
    }

    public static class Animal{
        public static void all(){
            System.out.println("Что-то");
        }
    }

    public class Cat extends Animal{
        public static void sound(){
            System.out.println("Mrrrrr");
        }
    }

    public static class Tiger extends Animal{
        public void run(){
            System.out.println("tgd, tgd");
        }
    }
}
