package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());
        int c = Integer.parseInt(read.readLine());

        if(a + b > c && a + c > b && b + c > a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}