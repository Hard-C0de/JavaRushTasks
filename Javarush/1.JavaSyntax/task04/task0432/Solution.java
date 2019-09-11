package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String text = r.readLine();
        int a = Integer.parseInt(r.readLine());
        int count = 0;

        while(count != a) {
            System.out.println(text);
            count++;
        }
    }
}
