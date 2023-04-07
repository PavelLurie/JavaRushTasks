package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        try (BufferedReader file = new BufferedReader(new FileReader(nameOne));
             BufferedReader file2 = new BufferedReader(new FileReader(nameTwo))) {
            while (file.ready()) {
                allLines.add(file.readLine());
            }
            while (file2.ready()) {
                forRemoveLines.add(file2.readLine());
            }
        }
        Solution ob = new Solution();
        ob.joinData();
    }
    public void joinData() throws CorruptedDataException, Exception {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
