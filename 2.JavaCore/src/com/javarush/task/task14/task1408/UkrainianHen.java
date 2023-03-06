package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.BELARUS;
import static com.javarush.task.task14.task1408.Country.UKRAINE;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), UKRAINE, getCountOfEggsPerMonth());
    }
}
