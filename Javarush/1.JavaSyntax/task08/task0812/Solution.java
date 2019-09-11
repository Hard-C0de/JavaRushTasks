package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        int count = 1;
        for(int i = 0, k = 0, j = 0; i < 10; i++) {
            list.add(Integer.parseInt(r.readLine()));
            if(list.get(i).equals(list.get(k))) j++;
            else {
                k = i;
                j = 1;
            }
            if(j > count) count = j;
        }
        System.out.println(count);
    }
}