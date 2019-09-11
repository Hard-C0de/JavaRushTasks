package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 20; i++)
            hashSet.add(i);

        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            int num = (int) iter.next();
            if(num > 10)
                iter.remove();
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
