package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        double a, sr = 0, i = 0;
        while(true) {
            a = Double.parseDouble(r.readLine());
            if(a == -1)
                break;
            sr = sr + a;
            i++;
        }
        System.out.println(sr/i);
    }
}

