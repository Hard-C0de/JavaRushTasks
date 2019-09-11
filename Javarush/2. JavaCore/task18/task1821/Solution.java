package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);

        HashMap<Integer, Integer> map = new HashMap<>();

        while(fis.available() > 0) {
            int byt = fis.read();
            if(map.containsKey(byt))
                map.put(byt, map.get(byt) + 1);
            else
                map.put(byt, 1);
        }
        fis.close();

        for(int i = 0; i <= 127; i++) {
            if(map.containsKey(i)) {
                System.out.println((char) i + " " + map.get(i));
            }
        }
    }
}
