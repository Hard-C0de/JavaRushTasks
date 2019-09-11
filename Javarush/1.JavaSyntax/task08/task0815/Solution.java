package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name1", "Fam1");
        map.put("Name2", "Fam2");
        map.put("Name3", "Fam3");
        map.put("Name4", "Fam4");
        map.put("Name5", "Fam5");
        map.put("Name6", "Fam");
        map.put("Name7", "Fam");
        map.put("Name8", "Fam");
        map.put("Name9", "Fam9");
        map.put("Name10", "Fam10");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(HashMap.Entry<String, String> pair : map.entrySet()) {
            if(pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(HashMap.Entry<String, String> pair : map.entrySet()) {
            if(pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
