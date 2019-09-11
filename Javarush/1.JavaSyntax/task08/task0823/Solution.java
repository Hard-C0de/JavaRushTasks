package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String upStr = "";      //строка на вывод
        boolean space = true;   //сигнал для повышения регистра

        for(int i=0; i<s.length(); i++){

            String current = s.charAt(i)+""; //valueOf
            if(current.equals(" ")){
                space = true;
                upStr = upStr+current; //заполнение пробелами
                continue;
            }
            if(space){
                current = current.toUpperCase(); //первая буква в верхний регистр
                space = false;
            }
            upStr = upStr+current; //заполнение символами
        }
        System.out.println(upStr);
    }
}
