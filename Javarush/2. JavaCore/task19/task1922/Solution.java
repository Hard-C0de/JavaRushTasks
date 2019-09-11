package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(r.readLine()));
        r.close();

        while(fr.ready()) {
            String allLine = fr.readLine();
            String[] line = allLine.split(" ");
            int count = 0;
            for(String l : line)
                if(words.contains(l))
                    count++;
            if(count == 2)
                System.out.println(allLine);
        }
        fr.close();
    }
}
