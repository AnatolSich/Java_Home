package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Task08 {
    public static void main(String[] args) throws IOException {
        String[] str = new String[10];
        int[] dig = new int[10];
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < str.length; i++) {
            str[i] = bfr.readLine();
            dig[i] = str[i].length();

        }
        for (int i = 0; i < dig.length; i++) {
            System.out.println(dig[i]);
        }

    }
}
