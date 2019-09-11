package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(r.readLine());
        r.close();

        String s = "";

        while (fr.ready()) {
            char symbol = (char) fr.read();
            s += String.valueOf(symbol).toLowerCase();
        }

        fr.close();

        int col = 0;

        s = s.replaceAll("\\p{Punct}", " ");
        s = s.replaceAll("\n", " ");

        String[] mS = s.split(" ");

        for(String str: mS){
            str = str.trim();
            if (str.equals("world"))
                col++;
        }

        System.out.println(col);
    }
}
