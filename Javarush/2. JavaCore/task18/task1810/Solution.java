package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            FileInputStream file = new FileInputStream(r.readLine());
            if(file.available() < 1000) {
                file.close();
                r.close();
                throw new DownloadException();
            }
            file.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
