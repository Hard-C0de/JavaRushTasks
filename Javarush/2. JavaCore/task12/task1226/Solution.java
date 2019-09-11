package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Climb, Run{
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements Run{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    interface Fly { void fly(); }
    interface Climb { void climb(); }
    interface Run { void run(); }
}
