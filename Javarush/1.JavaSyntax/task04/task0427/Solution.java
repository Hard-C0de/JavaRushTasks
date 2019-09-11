package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int col = (int)(Math.log10(a)+1);

        if(col == 1 && a%2 == 0)
            System.out.println("четное однозначное число");
        else if(col == 1 && a%2 != 0)
            System.out.println("нечетное однозначное число");
        else if(col == 2 && a%2 == 0)
            System.out.println("четное двузначное число");
        else if(col == 2 && a%2 != 0)
            System.out.println("нечетное двузначное число");
        else if(col == 3 && a%2 == 0)
            System.out.println("четное трехзначное число");
        else if(col == 3 && a%2 != 0)
            System.out.println("нечетное трехзначное число");

    }
}
