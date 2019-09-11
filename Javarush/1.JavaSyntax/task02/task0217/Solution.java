package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m;
        if(min(a, b) < min(c, d))
            m = min(a, b);
        else
            m = min(c, d);
        return m;
    }

    public static int min(int a, int b) {
        int m;
        if(a < b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}