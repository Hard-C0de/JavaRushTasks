package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        int[] a = new int[10];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++)
            s[i] = r.readLine();

        for(int j = 0; j < 10; j++) {
            a[j] = s[j].length();
            System.out.println(a[j]);
        }
    }
}
