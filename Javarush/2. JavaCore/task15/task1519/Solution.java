package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String stream;

        while(!(stream = bufferedReader.readLine()).equals("exit")) {
            try {
                if (stream.contains(".")) {
                    Double a = new Double(stream);
                    print(a);
                } else if (Integer.parseInt(stream) <= 0 || Integer.parseInt(stream) >= 128) {
                    Integer a = new Integer(stream);
                    print(a);
                } else if (Short.parseShort(stream) > 0 && Short.parseShort(stream) < 128) {
                    Short a = new Short(stream);
                    print(a);
                }
            }catch (NumberFormatException e) {
                print(stream);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
