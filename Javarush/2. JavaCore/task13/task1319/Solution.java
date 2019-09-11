package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String enteredString;

    public static void main(String[] args) throws IOException {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String outputFileName = bufferedReader.readLine();
            bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));

            while(true) {
                enteredString = bufferedReader.readLine();
                bufferedWriter.write(enteredString + "\n");
                bufferedWriter.flush();
                if(isExit()) {
                    closeAllStreams();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isExit() {
        return enteredString.equals("exit");
    }

    private static void closeAllStreams() {
        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
