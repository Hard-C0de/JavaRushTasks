package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String fileName = "";
            try {
                fileName = r.readLine();
                FileReader fr = new FileReader(fileName);

                fr.read();

                fr.close();

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
