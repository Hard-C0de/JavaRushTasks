package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = String.valueOf(number);
        char[] strToArray = s.toCharArray();
        return Integer.parseInt(String.valueOf(strToArray[0])) + Integer.parseInt(String.valueOf(strToArray[1])) + Integer.parseInt(String.valueOf(strToArray[2]));
    }
}