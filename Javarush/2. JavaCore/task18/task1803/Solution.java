package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inS = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        HashMap<Integer, Integer> arrInt = new HashMap<>();

        int max = 1;

        while (inS.available() > 0) {
            int key = inS.read();
            int value = 1;
            if(arrInt.containsKey(key)) {
                arrInt.put(key, arrInt.get(key).intValue() + 1);
                if(arrInt.get(key).intValue() > max)
                    max = arrInt.get(key).intValue();
            }
            else
                arrInt.put(key, value);
        }

        inS.close();

        for(HashMap.Entry<Integer, Integer> pair : arrInt.entrySet())
            if(pair.getValue() == max)
                System.out.print(pair.getKey() + " ");



        //    for(HashMap.Entry<Integer, Integer> pair : arrInt.entrySet())
        //        System.out.println(pair.getKey() + " " + pair.getValue());

        //    System.out.println("Max: " + max);
    }
}
