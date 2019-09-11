package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(r.readLine()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(r.readLine()));
        r.close();

        while(br.ready()) {
            String ch = String.valueOf((char) br.read());
            if(ch.equals("."))
                ch = "!";
            bw.write(ch);
        }

        br.close();
        bw.close();
    }
}
