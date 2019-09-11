package com.javarush.task.task19.task1920;

/* 
Самый богатый
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

        double max = 0;
        while(fr.ready()) {
            String[] buffer = fr.readLine().split(" ");
            map.merge(buffer[0], Double.parseDouble(buffer[1]), Double::sum);
            if(map.get(buffer[0]) > max)
                max = map.get(buffer[0]);
        }

        fr.close();

        for(Map.Entry<String, Double> pair : map.entrySet())
            if(pair.getValue().equals(max))
                System.out.println(pair.getKey());
    }
}
