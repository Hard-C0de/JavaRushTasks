package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0 , "ноль");
        map.put(1 , "один");
        map.put(2 , "два");
        map.put(3 , "три");
        map.put(4 , "четыре");
        map.put(5 , "пять");
        map.put(6 , "шесть");
        map.put(7 , "семь");
        map.put(8 , "восемь");
        map.put(9 , "девять");
        map.put(10 , "десять");
        map.put(11 , "одиннадцать");
        map.put(12 , "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(r.readLine()));
        r.close();

        while(fr.ready()) {
            String[] number = fr.readLine().split(" ");
            String newline = "";
            for(int i = 0; i < number.length; i++) {
                int num = -1;
                try {
                    num = Integer.parseInt(number[i]);
                } catch (Exception e) {
                }
                if(num >= 0 && map.containsKey(num))
                    newline += map.get(num) + " ";
                else
                    newline += number[i] + " ";
            }
            System.out.println(newline);
        }
        fr.close();
    }
}
