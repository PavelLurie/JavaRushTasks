package com.javarush.task.pro.task16.task1613;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.*;

public class Main {
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.print(dateTime.getDayOfWeek() + " - ");
            System.out.print(dateTime.getHour() + ":" + dateTime.getMinute() + " | ");
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }
    }
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        int weekend = day.getValue();
        int hour = dateTime.getHour();
        if (weekend <= FRIDAY && hour < WEEKEND_START_FRIDAY_CUT_OFF_HOUR) {
            return false;
        } else if (weekend >= SUNDAY && hour == WEEKEND_END_SUNDAY_CUT_OFF_HOUR){
            return false;
        } else return true;

    }
}
