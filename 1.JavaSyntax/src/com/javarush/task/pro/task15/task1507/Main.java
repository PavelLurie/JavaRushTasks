package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path myPath = Paths.get(scanner.nextLine());

        List<String> lines = Files.readAllLines(myPath);


        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            System.out.println(line.replaceAll("[, . ]", ""));
        }
    }
}
