package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = r.readLine();
            if(s.equals("exit"))
                break;

            new ReadThread(s).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private int b;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream fr = new FileInputStream(fileName);
                HashMap<Integer, Integer> map = new HashMap<>();
                while(fr.available() > 0) {
                    int by = fr.read();
                    if(map.containsKey(by))
                        map.put(by, map.get(by) + 1);
                    else
                        map.put(by, 1);
                }
                fr.close();

                int max = 0;
                int maxBy = 0;
                for(HashMap.Entry<Integer, Integer> pair : map.entrySet()) {
                    if(pair.getValue() > max) {
                        max = pair.getValue();
                        maxBy = pair.getKey();
                    }
                }

                resultMap.put(fileName, maxBy);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
