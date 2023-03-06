package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Draft implements Person{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        do {
            key = reader.readLine();
            if (key.equals("user")){
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("proger")) {
                person = new Person.Proger();
            }
            doWork(person);
        }while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"));
    }

    public static void doWork(Person person) {
        Person.User user = new User();
        Person.Loser loser = new Loser();
        Person.Coder coder = new Coder();
        Person.Proger proger = new Proger();

        if (person instanceof User){
            user.live();
        } else if (person instanceof Loser) {
            loser.doNothing();
        } else if (person instanceof Coder) {
            coder.writeCode();
        } else if (person instanceof Proger) {
            proger.enjoy();
        }


    }
}
