package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }
    interface CanMove{
        default Double speed(){
            return 0.0;
        }
    }

    interface CanFly extends CanMove{
        default Double speed(CanFly d){
            return 0.0;
        }
    }
}