package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        
        
        
        Person person = null;
        if (args[0].equals("-c")){
            if (args[2].equalsIgnoreCase("м")){
                person = Person.createMale(args[1], input.parse(args[3]));
            } else if (args[2].equalsIgnoreCase("ж")) {
                person = Person.createFemale(args[1], input.parse(args[3]));
            }allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
            //System.out.println(allPeople.get(2));
        } else if (args[0].equals("-r")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()){
               person =  allPeople.get(id);
               String sex = null;
               if(person.getSex() == Sex.MALE){
                   sex = "м";
               }else if (person.getSex() == Sex.FEMALE){
                   sex = "ж";
               }
                System.out.println(person.getName() + " "
                        + sex + " "
                        + output.format(person.getBirthDate()));
            }
        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()){
                person = allPeople.get(id);
                person.setName(args[2]);
                if (args[3].equalsIgnoreCase("м")){
                    person.setSex(Sex.MALE);
                } else if (args[3].equalsIgnoreCase("ж")) {
                    person.setSex(Sex.FEMALE);
                }
                person.setBirthDate(input.parse(args[4]));
                System.out.println(person);

            }
        }else if (args[0].equals("-d")){
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
        }

    }
}
