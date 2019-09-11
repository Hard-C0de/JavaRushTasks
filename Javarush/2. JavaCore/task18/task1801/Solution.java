package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inS = new FileInputStream(r.readLine());

        int max = 0;

        while(inS.available() > 0) {
            int bytes = inS.read();
            if(bytes > max) max = bytes;
        }

        System.out.println(max);

        inS.close();
    }
}
