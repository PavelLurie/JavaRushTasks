package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             InputStream scr = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream dsr = Files.newOutputStream(Path.of(scanner.nextLine()))) {
            byte[] first = scr.readAllBytes();

            for (int i = 0; i < first.length; i += 2) {
                if (i < first.length - 1) {
                    dsr.write(first[i + 1]);
                    dsr.write(first[i]);
                } else {
                    dsr.write(first[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

