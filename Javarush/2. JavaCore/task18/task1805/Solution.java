package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream fInS = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        SortedSet<Integer> map = new TreeSet<>();

        while(fInS.available() > 0)
            map.add(fInS.read());

        fInS.close();

        while(!map.isEmpty()) {
            System.out.print(map.first() + " ");
            map.remove(map.first());
        }
    }
}
