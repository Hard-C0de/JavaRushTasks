package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine().toLowerCase();
        String monthName = input.substring(0,1).toUpperCase() + input.substring(1);


        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        HashMap<String, Integer> months = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            months.put(monthNames[i], i);
        }
        int curMonth = 0;
        if (months.containsKey(monthName)) {
            curMonth = months.get(monthName) + 1;
        }
        System.out.println(monthName + " is the " + curMonth + " month");

    }
}
