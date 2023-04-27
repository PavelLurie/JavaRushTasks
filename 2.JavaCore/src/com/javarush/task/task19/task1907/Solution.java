package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        br.close();

        FileReader fr = new FileReader(file);
        String content = null;
        int count = 0;
        while (fr.ready()){
            Scanner scanner = new Scanner(fr);
            content = scanner.nextLine();
            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
            }
        }
        System.out.println(content);
        fr.close();

//        for (String world : content.split("[\\p{P} ]")){
//            if (world.equals("world")){
//                count++;
//            }
//        }
//        System.out.println(count);


        Pattern pattern = Pattern.compile("\\bworld\\b");
        for (String world : content.split("[\\p{P}]")){
            Matcher matcher = pattern.matcher(world);
            if (matcher.find()) count++;
        }
        System.out.println(count);

    }
}

