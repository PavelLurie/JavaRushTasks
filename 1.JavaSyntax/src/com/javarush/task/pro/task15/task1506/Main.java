package com.javarush.task.pro.task15.task1506;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path myPath = Paths.get(scanner.nextLine());

        List < String > lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String line1 = line.replace(".", "");
            String line2 = line1.replace(",", "");
            String line3 = line2.replace(" ", "");
            System.out.println(line3);
        }
    }
}

