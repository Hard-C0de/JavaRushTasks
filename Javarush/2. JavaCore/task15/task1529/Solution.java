package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String line = r.readLine();

        if(line.equals("helicopter"))
            result = new Helicopter();
        else if(line.equals("plane"))
            result = new Plane(25);

        r.close();
    }
}
