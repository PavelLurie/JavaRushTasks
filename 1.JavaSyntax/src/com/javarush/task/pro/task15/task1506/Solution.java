package com.javarush.task.pro.task15.task1506;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Path myPath = Paths.get(scanner.nextLine());

        List <String> lines = null;
        try {
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            System.out.println(line.replaceAll("[, . ]", ""));
        }
    }
}

