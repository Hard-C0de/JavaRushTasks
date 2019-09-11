package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a < 0 && a%2 == 0)
            System.out.println("отрицательное четное число");
        else if(a < 0 && a%2 != 0)
            System.out.println("отрицательное нечетное число");
        else if(a > 0 && a%2 == 0)
            System.out.println("положительное четное число");
        else if(a > 0 && a%2 != 0)
            System.out.println("положительное нечетное число");
        else
            System.out.println("ноль");
    }
}
