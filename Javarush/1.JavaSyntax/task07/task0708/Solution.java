package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;

        for(int i = 0; i < 5; i++) {
            strings.add(i, r.readLine());
            if(strings.get(i).length() > max)
                max = strings.get(i).length();
        }

        for(int i = 0; i < 5; i++) {
            if(strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
    }
}
