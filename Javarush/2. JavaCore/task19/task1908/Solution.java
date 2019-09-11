package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(r.readLine()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(r.readLine()));
        r.close();

        String s = "";
        while(br.ready()) {
            char symb = (char) br.read();
            s += symb;
        }

        String[] mas = s.split(" ");
        for(int i = 0; i < mas.length; i++) {
            try {
                if(Integer.parseInt(mas[i]) <= 0 || Integer.parseInt(mas[i]) >= 0)
                    bw.write(mas[i] + " ");
            } catch (Exception e) {

            }
        }

        br.close();
        bw.close();
    }
}
