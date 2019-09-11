package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int max = 1000;

        for(int i = 0; i < 5; i++) {
            strings.add(i, r.readLine());
            if(strings.get(i).length() < max)
                max = strings.get(i).length();
        }

        for(int i = 0; i < 5; i++)
            if(strings.get(i).length() == max)
                System.out.println(strings.get(i));
    }
}
