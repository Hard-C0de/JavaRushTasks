package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName);

        String grandMomName = reader.readLine();
        Cat catGrandMom = new Cat(grandMomName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMom, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandDad);
        System.out.println(catGrandMom);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat dad) {
            this.name = name;
            this.parent = parent;
            this.dad = dad;
        }

        @Override
        public String toString() {
            if (parent == null && dad == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if(parent == null && dad != null)
                return "Cat name is " + name + ", no mother," + "father is " + dad.name;
            else if(parent != null && dad == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parent.name + ", father is " + dad.name;
        }
    }

}
