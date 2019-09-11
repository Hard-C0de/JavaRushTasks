package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("child1", false, 17, new ArrayList<>());
        Human child2 = new Human("child2", false, 18, new ArrayList<>());
        Human child3 = new Human("child3", false, 20, new ArrayList<>());

        Human mother = new Human("Mother", false, 39, new ArrayList<>());
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human father = new Human("Father", true, 40, new ArrayList<>());
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human ded = new Human("Ded", true, 72, new ArrayList<>());
        ded.children.add(father);

        Human ded2 = new Human("Ded2", true, 71, new ArrayList<>());
        ded2.children.add(mother);

        Human ba = new Human("Ba", false, 70, new ArrayList<>());
        ba.children.add(father);

        Human ba2 = new Human("Ba2", false, 69, new ArrayList<>());
        ba2.children.add(mother);

        System.out.println(ded);
        System.out.println(ded2);
        System.out.println(ba);
        System.out.println(ba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
