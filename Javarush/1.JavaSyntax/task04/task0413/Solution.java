package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "понедельник");
        map.put(2, "вторник");
        map.put(3, "среда");
        map.put(4, "четверг");
        map.put(5, "пятница");
        map.put(6, "суббота");
        map.put(7, "воскресенье");
        if(a > 7 || a < 1)
            System.out.println("такого дня недели не существует");
        else
            System.out.println(map.get(a));
    }
}