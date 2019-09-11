package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        if(max(a, b) > max(c, d))
            System.out.println(max(a, b));
        else
            System.out.println(max(c, d));
    }

    public static int max(int m, int n) {
        if(m > n)
            return m;
        else
            return n;
    }
}
