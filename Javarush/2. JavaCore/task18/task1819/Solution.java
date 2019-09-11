package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String file1 = r.readLine();
        String file2 = r.readLine();

        FileOutputStream fos = new FileOutputStream(file1);
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte[] bufferFirst = new byte[fis1.available()];
        int countFirst = 0;
        while(fis1.available() > 0)
            countFirst = fis1.read(bufferFirst);


        byte[] buffer = new byte[fis2.available()];
        while (fis2.available() > 0) {
            int count = fis2.read(buffer);
            fos.write(buffer, 0, count);
            fos.write(bufferFirst, 0, countFirst);
        }

        fos.close();
        fis1.close();
        fis2.close();
    }
}
