package com.javarush.games.game2048;


import java.util.Arrays;
import java.util.SortedMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

/*
        int[][] gameField = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14 , 15, 16},
        };

        int w = 0;
        int s = 0;
        int g = 0;
        int k = 0;
        boolean result1 = false;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                while (j < gameField.length - 1){
                    w = gameField[i][j];
                    s = gameField[i][j + 1];
                    break;
                }if (w != s) {
                    while (i < gameField.length - 1){
                        g = gameField[i][j];
                        k = gameField[i + 1][j];
                        break;
                    }if (g == k)result1 = true;
                    }else result1 = true;
                }
            }System.out.println(result1);

 */

        System.out.println(canUserMove());
    }






    static int[][] gameField = {
            {2, 128, 2, 2},
            {512, 8, 16, 32},
            {64, 1024, 4, 2048},
            {2, 4 , 8, 16},
    };




    public static boolean canUserMove() {
        if (method1()) {
            return true;
        }else if (method2()){
            return true;
        } else return false;
    }

    public static boolean method1(){
        int count = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] == 0 ) count++;
                if (count > 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean method2(){
        int w = 0;
        int s = 0;
        int g = 0;
        int k = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                while (j < gameField.length - 1){
                    w = gameField[i][j];
                    s = gameField[i][j + 1];
                    break;
                }if (w != s) {
                    while (i < gameField.length - 1){
                        g = gameField[i][j];
                        k = gameField[i + 1][j];
                        break;
                    }if (g == k)return true;
                }else return true;
            }
        }return false;
    }
}