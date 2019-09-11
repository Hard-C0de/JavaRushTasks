package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if(args[0].equals("-c")) {
            try {
                switch (args[2]) {
                    case "м":
                        allPeople.add(Person.createMale(args[1], format.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                        break;
                    case "ж":
                        allPeople.add(Person.createFemale(args[1], format.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                        break;
                    default:
                        System.out.println("WTF?");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if(args[0].equals("-u")) {
            try {
                int id = Integer.parseInt(args[1]);
                Sex sex = Sex.MALE;

                if(args[3].equals("м"))
                    sex = Sex.MALE;
                else if(args[3].equals("ж"))
                    sex = Sex.FEMALE;

                allPeople.get(id).setName(args[2]);
                allPeople.get(id).setSex(sex);
                allPeople.get(id).setBirthDay(format.parse(args[4]));
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);

            allPeople.get(id).setName(null);
            allPeople.get(id).setBirthDay(null);
            allPeople.get(id).setSex(null);
        }
        else if(args[0].equals("-i")) {
            SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            int id = Integer.parseInt(args[1]);
            String sex="";
            if(allPeople.get(id).getSex() == Sex.MALE)
                sex = "м";
            else if (allPeople.get(id).getSex() == Sex.FEMALE)
                sex = "ж";

            System.out.println(allPeople.get(id).getName() + " " + sex + " " + outFormat.format(allPeople.get(id).getBirthDay()));
        }
    }
}
