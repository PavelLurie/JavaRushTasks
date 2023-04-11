package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileOne = new FileInputStream(br.readLine());
        FileOutputStream fileTwo = new FileOutputStream(br.readLine());
        FileOutputStream fileThree = new FileOutputStream(br.readLine());

        byte[] buffer = new byte[1000];
        while (fileOne.available() > 0) {
            int count = fileOne.read(buffer);
            int firstPart = count - count / 2;
            if (count % 2 != 0) {
                fileTwo.write(buffer, 0,  firstPart);
                fileThree.write(buffer, firstPart,  count / 2);

            } else {
                fileTwo.write(buffer, 0, count / 2); //записать блок(часть блока) во второй поток
                fileThree.write(buffer, firstPart, count / 2); //записать блок(часть блока) во второй поток
            }
        }

        fileOne.close();
        fileTwo.close();
        fileThree.close();
    }
}
