package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n;

        n = Integer.parseInt(reader.readLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);
        maximum = numbers[numbers.length - 1];

        System.out.println(maximum);
    }
}
