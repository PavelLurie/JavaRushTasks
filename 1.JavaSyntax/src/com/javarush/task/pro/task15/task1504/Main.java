package com.javarush.task.pro.task15.task1504;

import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        try {
            Files.createFile(Paths.get("D:\\file10.txt"));
            BufferedWriter bf = Files.newBufferedWriter(Paths.get("D:\\file10.txt"));
            bf.write("Hello world!");
            bf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
