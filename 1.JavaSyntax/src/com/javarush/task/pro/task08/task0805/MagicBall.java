package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        /*
            Создаем рандомное число
        */
        Random r = new Random();
        int x = r.nextInt(8);

        /*
            Создаем массив из строковых методов
        */
        String[] array = new String[] {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};        
        /*
            Циклом for проходимся по массиву и ищем
            индекс, равный полученному рандомному числу.
        */
        String str = null;
        for (int i = 0; i < array.length; i++) {
            if (i == x){
                str = array[i];
                return str;
            }
        }
        /*
            Возвращаем значение этого индекса.
        */
        return null;
    }
}
