package com.javarush.task.pro.task13.task1317;

public class Main {
    public static final Main JANUARY = new Main(0);
    public static final Main FEBRUARY = new Main(1);
    public static final Main MARCH = new Main(2);
    public static final Main APRIL = new Main(3);
    public static final Main MAY = new Main(4);
    public static final Main JUNE = new Main(5);
    public static final Main JULY = new Main(6);
    public static final Main AUGUST = new Main(7);
    public static final Main SEPTEMBER = new Main(8);
    public static final Main OCTOBER = new Main(9);
    public static final Main NOVEMBER = new Main(10);
    public static final Main DECEMBER = new Main(11);

    private static final Main[] array = {JANUARY, FEBRUARY,
            MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private final int value;

    private Main (int value)
    {
        this.value = value;
    }

    public int ordinal()
    {
        return this.value;
    }

    public static Main[] values()
    {
        return array;
    }
}






