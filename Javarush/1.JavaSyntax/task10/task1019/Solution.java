package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        while(true) {

            String i = reader.readLine();
            if (i.isEmpty())
                break;
            int id = Integer.parseInt(i);

            String name = reader.readLine();
            hashMap.put(name,id);

        }
        for (HashMap.Entry<String,Integer> pair: hashMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
