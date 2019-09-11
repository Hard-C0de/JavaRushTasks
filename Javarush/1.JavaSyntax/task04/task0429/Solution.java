package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int counter = 0;
        int counterN = 0;

        if(a > 0)
            counter++;
        else if(a < 0)
            counterN++;

        if(b > 0)
            counter++;
        else if (b < 0)
            counterN++;

        if(c > 0)
            counter++;
        else if (c < 0)
            counterN++;

        System.out.println("количество отрицательных чисел: " + counterN);
        System.out.println("количество положительных чисел: " + counter);
    }
}
