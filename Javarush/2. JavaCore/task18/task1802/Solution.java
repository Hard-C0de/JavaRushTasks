package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inS = new FileInputStream(r.readLine());

        int min = 256;

        while(inS.available() > 0) {
            int bytes = inS.read();
            if(bytes < min) min = bytes;
        }

        System.out.println(min);

        inS.close();
    }
}
