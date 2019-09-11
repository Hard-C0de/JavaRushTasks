package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(r.readLine());
            b = Integer.parseInt(r.readLine());
            if(a <= 0 || b <= 0) throw new Exception();
        } catch (Exception e) {
            throw e;
        }

        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println(a);

    }
}
