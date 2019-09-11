package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;;
        int min = Integer.MAX_VALUE;
        int[] mass = new int[20];
        for(int i = 0; i < mass.length ; i++){
            mass[i] = Integer.parseInt(reader.readLine());
            if(mass[i]> max) max = mass[i];
            if (mass[i] < min) min = mass[i];
        }
        System.out.print(max + " " + min);
    }
}
