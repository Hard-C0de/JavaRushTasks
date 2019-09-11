package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("d M y");
        System.out.println(formatForDateNow.format(date));
    }
}
