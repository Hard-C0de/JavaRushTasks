package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fins = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fos = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] buffer = new byte[fins.available()];

        while(fins.available() > 0) {
            fins.read(buffer);
        }

        for(int i = buffer.length - 1; i >= 0; i--)
            fos.write(buffer[i]);

        fins.close();
        fos.close();
    }
}
