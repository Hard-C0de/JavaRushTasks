package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(r.readLine()));
        r.close();

        while(fr.ready()) {
            String line = fr.readLine();
            for(int i = line.length() - 1; i >= 0; i--)
                System.out.print(line.charAt(i));
            System.out.println();
        }
        fr.close();
    }
}
