package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = 1;
        while(count != 11) {
            System.out.println(a[0] * count + " " + a[1] * count + " " + a[2] * count + " " + a[3] * count + " " + a[4] * count + " " + a[5] * count + " " + a[6] * count + " " + a[7] * count + " " + a[8] * count + " " + a[9] * count);
            count ++;
        }
    }
}
