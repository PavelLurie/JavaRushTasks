package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
       BufferedReader br = new BufferedReader(new FileReader(args[0]));
       SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");


       while (br.ready()){
           Date date = new Date();
           String name = null;
           String[]mass = br.readLine().split("(?<=\\D) (?=\\d)" );
           for (int i = 0; i < mass.length; i++) {
               if (i == 1){
                   date = sdf.parse(mass[i]);
               }else {
                   name = mass[i];
               }
           }
           PEOPLE.add(new Person(name, date));
       }

       br.close();
//       for (Person person : PEOPLE){
//           System.out.println(person.getName() + " " + person.getBirthDate());
//       }

    }
}
