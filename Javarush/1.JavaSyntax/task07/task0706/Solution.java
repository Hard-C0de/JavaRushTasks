package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[15];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 15; i++)
            a[i] = Integer.parseInt(r.readLine());

        int c = 0, n = 0;

        for(int i = 0; i < 15; i++) {
            if(i % 2 == 0)
                c += a[i];
            else
                n += a[i];
        }

        if(c > n)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
