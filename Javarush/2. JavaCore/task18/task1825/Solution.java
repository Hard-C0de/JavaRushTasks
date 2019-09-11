package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, byte[]> filesName = new TreeMap<>();
        String pathName = "";
        boolean isPathDone = false;

        while(true) {
            String s = r.readLine();
            if(s.equals("end"))
                break;

            FileInputStream fis = new FileInputStream(s);

            byte[] buffer = new byte[fis.available()];

            while(fis.available() > 0)
                fis.read(buffer);

            fis.close();

            String[] splitthis = s.split(".part");

            filesName.put(Integer.valueOf(splitthis[1]), buffer);

            if(!isPathDone) {
                pathName = splitthis[0];
                isPathDone = true;
            }
        }

        FileOutputStream fos = new FileOutputStream(pathName);
        for(Map.Entry<Integer, byte[]> pair : filesName.entrySet())
            fos.write(pair.getValue());

        fos.close();
    }
}
