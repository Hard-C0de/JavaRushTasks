package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream fInS = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        int min = 256;

        while (fInS.available() > 0) {
            int key = fInS.read();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                if(map.get(key) < min)
                    min = map.get(key);
            }
            else {
                map.put(key, 1);
                min = 1;
            }
        }

        fInS.close();

        for(HashMap.Entry<Integer, Integer> pair : map.entrySet())
            if(pair.getValue() == min)
                System.out.print(pair.getKey() + " ");

        //    for(HashMap.Entry<Integer, Integer> pair : map.entrySet())
        //        System.out.println(pair.getKey() + " " + pair.getValue());

        //    System.out.println("Min: " + min);
    }
}
