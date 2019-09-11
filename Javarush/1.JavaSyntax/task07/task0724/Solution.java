package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Ded", true, 70);
        Human ba1 = new Human("Babushka", false, 69);
        Human ded2 = new Human("Ded2", true, 72);
        Human ba2 = new Human("Babushka2", false, 68);
        Human father = new Human("Pa", true, 40, ded1, ba1);
        Human mother = new Human("Mom", false, 39, ded2, ba2);
        Human child1 = new Human("Child1", true, 20, father, mother);
        Human child2 = new Human("Child2", true, 18, father, mother);
        Human child3 = new Human("Child3", true, 16, father, mother);

        System.out.println(ded1);
        System.out.println(ba1);
        System.out.println(ded2);
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
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















