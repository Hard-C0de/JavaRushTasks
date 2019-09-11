package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.strength*this.weight > anotherCat.strength*anotherCat.weight;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 10;
        cat1.strength = 15;

        Cat cat2 = new Cat();
        cat2.weight = 9;
        cat2.strength = 16;

        cat1.fight(cat2);
    }
}
