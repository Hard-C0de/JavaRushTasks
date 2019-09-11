package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);

        while(fr.ready()) {
            String[] word = fr.readLine().split(" ");
            for(int i = 0; i < word.length; i++) {
                for(int j = 0; j < word[i].length(); j++) {
                    try {
                        int num = Integer.parseInt(String.valueOf(word[i].charAt(j)));
                        if (num >= 0) {
                            fw.write(word[i] + " ");
                            j = word[i].length();
                        }
                    } catch (Exception e ) {}
                }
            }
        }

        fr.close();
        fw.close();
    }
}
