package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file1 = r.readLine();
        String file2 = r.readLine();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
        String line;
        while ((line = reader1.readLine()) != null) {
            for (String str:line.split(" "))
                writer.write((int) Math.round(Double.parseDouble(str)) + " ");
        }
        reader1.close();
        writer.close();
    }
}
