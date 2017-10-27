package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Task02 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();
        int n = Integer.parseInt(bfr.readLine());
        int i=0;
        while (i<n) {
            System.out.println(str);
            i++;
        }
    }
}
