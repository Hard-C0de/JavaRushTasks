package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        while (fis.available() > 0) {
            int bytes = fis.read();
            if((bytes >= 65 && bytes <= 90) || (bytes >= 97 && bytes <= 122)) count++;
        }
        fis.close();
        System.out.println(count);
    }
}
