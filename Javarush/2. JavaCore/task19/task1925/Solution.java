package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);

        List<String> list = new ArrayList<>();

        while(fr.ready()) {
            String[] mass = fr.readLine().split(" ");
            for(int i = 0; i < mass.length; i++) {
                if(mass[i].length() > 6)
                    list.add(mass[i]);
            }
        }
        fr.close();

        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
                fw.write(list.get(i));
            else
                fw.write(list.get(i) + ",");
        }

        fw.close();
    }
}
