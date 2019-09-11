package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();

        ArrayList<Character> one = new ArrayList<>();
        ArrayList<Character> two = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if (isVowel(s.charAt(i)))
                    one.add(s.charAt(i));
                else
                    two.add(s.charAt(i));
            }
        }

        for(Character res : one)
            System.out.print(res + " ");

        System.out.println("");

        for(Character res : two)
            System.out.print(res + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}