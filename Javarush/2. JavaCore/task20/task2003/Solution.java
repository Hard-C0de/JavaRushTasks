package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        InputStream fis = new FileInputStream(r.readLine());
        r.close();
        load(fis);
    }

    public void save(OutputStream outputStream) throws Exception {
        for(Map.Entry<String, String > pair : properties.entrySet())
            prop.put(pair.getKey(), pair.getValue());

        prop.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        prop.load(inputStream);

        Set<String> list = prop.stringPropertyNames();
        for(String cur : list)
            properties.put(cur, prop.getProperty(cur));
    }

    public static void main(String[] args) throws Exception {

    }
}
