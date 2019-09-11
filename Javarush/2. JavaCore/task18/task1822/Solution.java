package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fis = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        String s;
        while((s = fis.readLine()) != null) {
            if(s.startsWith(args[0] + " "))
                System.out.println(s);
        }
        fis.close();
    }
}
