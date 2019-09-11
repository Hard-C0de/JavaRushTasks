package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));

        SimpleDateFormat df = new SimpleDateFormat("d M yyyy");
        while(fr.ready()) {
            String line = fr.readLine();
            String name = line.replaceAll("\\d", "").trim();
            String date = line.substring(name.length() + 1);
            PEOPLE.add(new Person(name, df.parse(date)));
        }

        fr.close();
    }
}
