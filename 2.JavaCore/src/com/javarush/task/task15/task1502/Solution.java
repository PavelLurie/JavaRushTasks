package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    public static class Goose extends SmallAnimal{
        public String getSize(){
            SmallAnimal smallAnimal = new SmallAnimal();
            return "Гусь маленький, " + smallAnimal.getSize();
        }
    }

    public static class Dragon extends BigAnimal{
        public String getSize(){
            BigAnimal bigAnimal = new BigAnimal();
            return "Дракон большой, " + bigAnimal.getSize();
        }
    }

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {

            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {

            return "как кошка";
        }
    }
}
