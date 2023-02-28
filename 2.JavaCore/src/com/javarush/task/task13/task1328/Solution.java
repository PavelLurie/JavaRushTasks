package com.javarush.task.task13.task1328;

/* 
Битва роботов
*/

import static com.javarush.task.task13.task1328.AbstractRobot.getHitCount;

public class Solution {
    public static void main(String[] args) {
        AbstractRobot amigo = new Robot("Амиго");
        AbstractRobot enemy = new Robot("Сгибальщик-02");


        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);

       // int a = getHitCount();
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));

    }
}
