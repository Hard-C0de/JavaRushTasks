package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(bufferedReader.readLine()));

        String currentLine;
        while ((currentLine = file1.readLine()) != null)
            allLines.add(currentLine);

        while ((currentLine = file2.readLine()) != null)
            forRemoveLines.add(currentLine);

        new Solution().joinData();
    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
