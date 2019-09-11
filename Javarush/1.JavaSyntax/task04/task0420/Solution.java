package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int[] mass = {a, b , c};
        int v;

        for(int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
                if (mass[i] < mass[i + 1]) {
                    v = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = v;
                }
            }
        }

        for(int k=0; k <3; k++)
            System.out.print(mass[k] + " ");
    }
}
