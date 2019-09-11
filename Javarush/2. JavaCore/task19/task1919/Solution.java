package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));

        SortedMap<String, Double> map = new TreeMap<>();

        while(fr.ready()) {
            String[] buffer = fr.readLine().split(" ");
            if(map.containsKey(buffer[0]))
                map.put(buffer[0], map.get(buffer[0]) + Double.parseDouble(buffer[1]));
            else
                map.put(buffer[0], Double.parseDouble(buffer[1]));
        }

        fr.close();

        for(Map.Entry<String, Double> pair : map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
    }
}
