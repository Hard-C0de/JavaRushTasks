package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        String n1 = br.readLine();
        String n2 = br.readLine();

        System.out.println(name + " получает "+n1+" через "+n2+" лет.");
    }
}
