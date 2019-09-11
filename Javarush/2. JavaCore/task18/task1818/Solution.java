package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream fis1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream fis2 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        while(fis1.available() > 0)
            fos.write(fis1.read());

        while (fis2.available() > 0)
            fos.write(fis2.read());

        fos.close();
        fis1.close();
        fis2.close();
    }
}
