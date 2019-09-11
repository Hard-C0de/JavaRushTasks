package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);

        int sym = fis.available();
        int space = 0;

        while (fis.available() > 0) {
            if(fis.read() == 32)
                space++;
        }

        System.out.println(String.format("%.2f", (double) space/sym*100));

        fis.close();
    }
}
