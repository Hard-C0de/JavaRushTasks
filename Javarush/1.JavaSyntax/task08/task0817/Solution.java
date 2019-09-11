package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
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
        map.put("Name11", "Fam10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> temp = new HashMap<>(map);
        for(Map.Entry<String, String> pair : temp.entrySet()) {
            String name = pair.getValue();
            int count = 0;
            for(Map.Entry<String, String> secondPair : map.entrySet()) {
                if(name.equals(secondPair.getValue()))
                    count++;
            }
            if(count > 2)
                removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
