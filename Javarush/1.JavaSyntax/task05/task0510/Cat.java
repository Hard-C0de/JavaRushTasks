package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age = 5;
    int weight = 7;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 4;
        this.weight = 5;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";

    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "white";

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;

    }

    public static void main(String[] args) {

    }
}
