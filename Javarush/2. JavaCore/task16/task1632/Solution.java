package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = threads.get(1);
        thread2.start();
        Thread.sleep(1000);
        thread2.interrupt();

        Thread thread4 = threads.get(3);
        Message message = (Message) thread4;
        thread4.start();
        Thread.sleep(1000);
        message.showWarning();
        System.out.println(thread4.isAlive());
    }

    public static class ThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                while(!isInterrupted()) {
                }
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class ThreadThree extends Thread {
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreadFour extends Thread implements Message{

        @Override
        public  void showWarning()
        {
            this.interrupt();
            try
            {
                this.join();
            }
            catch(Exception e)
            {

            }

        }
        @Override
        public void run()
        {
            Thread current = Thread.currentThread();
            while(!current.interrupted())
            {
            }
        }
    }

    public static class ThreadFive extends Thread {
        @Override
        public void run() {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            String s = "";

            try {
                while(!(s = r.readLine()).equals("N")) {
                    int num = Integer.parseInt(s);
                    sum += num;
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}