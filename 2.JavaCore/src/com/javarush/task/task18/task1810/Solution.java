package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try (FileInputStream fis = new FileInputStream(br.readLine())){
                if (fis.available() < 1000){
                    throw new DownloadException();
            }
            }
        }
    }
    public static class DownloadException extends Exception {

    }
}
