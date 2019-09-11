package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        String fileNameTwo = r.readLine();
        r.close();
        FileReader fr = new FileReader(fileName);
        FileWriter fw = new FileWriter(fileNameTwo);

        for(int i = 1; fr.ready(); i++) {
            int data = fr.read();
            if(i%2 == 0)
                fw.write(data);
        }

        fr.close();
        fw.close();
    }
}
