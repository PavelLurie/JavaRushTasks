package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.RUSSIA;
import static com.javarush.task.task14.task1408.Country.UKRAINE;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }

    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), RUSSIA, getCountOfEggsPerMonth());
    }
}
