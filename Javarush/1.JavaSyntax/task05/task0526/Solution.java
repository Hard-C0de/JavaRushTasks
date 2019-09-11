package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Petr", 27, "Moscow");
        Man man2 = new Man("Petr2", 20, "Moscow");
        Woman woman = new Woman("Katya", 27, "Moscow");
        Woman woman2 = new Woman("Katya2", 20, "Moscow");


        System.out.println(man);
        System.out.println(man2);
        System.out.println(woman);
        System.out.println(woman2);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman extends Man {
        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }
}
