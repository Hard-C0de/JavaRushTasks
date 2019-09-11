package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private int leight;
        private String address;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int weight, int leight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.leight = leight;
        }

        public Human(String name, int age, boolean sex, int weight, int leight, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.leight = leight;
            this.address = address;
        }

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, boolean sex, String address) {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }
    }
}
