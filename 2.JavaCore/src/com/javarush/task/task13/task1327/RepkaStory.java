package com.javarush.task.task13.task1327;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        try{
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i - 1);
            first.pull(second);
        }
        }catch (Exception e){

        }
    }
}
 /*
Проверь вывод на экран. Сказка звучит так:
Внучка за Бабку
Бабка за Дедку
Дедка за Репку
  */