package com.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date(date);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentTime = new Date(date);

        long a = (currentTime.getTime() - yearStartTime.getTime()) / (1000 * 60 * 60 * 24);
        if (a % 2 == 0) return true;
        else return false;
    }
}
