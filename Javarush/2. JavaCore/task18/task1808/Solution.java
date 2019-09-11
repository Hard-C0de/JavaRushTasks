package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fins = new FileInputStream(r.readLine());
        FileOutputStream fos1 = new FileOutputStream(r.readLine());
        FileOutputStream fos2 = new FileOutputStream(r.readLine());

        byte[] buffer;
        byte[] buffer2 = new byte[fins.available() / 2];

        if(fins.available()%2 == 0)
            buffer = new byte[fins.available() / 2];
        else
            buffer = new byte[fins.available() / 2 + 1];

        while(fins.available() > 0) {
            fos1.write(buffer, 0, fins.read(buffer));
            fos2.write(buffer2, 0 , fins.read(buffer2));
        }

        fins.close();
        fos1.close();
        fos2.close();
    }
}
