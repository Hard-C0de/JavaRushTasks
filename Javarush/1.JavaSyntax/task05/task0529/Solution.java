package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System .in));

        int sum=0, a;
        String s;
        while(true) {
            s = r.readLine();
            if(s.equals("сумма"))
                break;

            a = Integer.parseInt(s);

            sum = sum + a;
        }
        System.out.println(sum);
    }
}
