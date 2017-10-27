package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 22.06.2017.
 */

/* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Task05 {
    public static void main(String[] args) throws IOException {
        minMax(twoDigit(5));

    }

    private static int[] twoDigit(int n) throws IOException {
        int[] arrayDig = new int[n];
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            arrayDig[i] = Integer.parseInt(bfr.readLine());
        }

        return arrayDig;
    }

    private static void minMax(int[] arrayDig) {
        int min = arrayDig[0];
        int max = arrayDig[0];

        for (int i = 0; i < arrayDig.length; i++) {

            if (arrayDig[i] < min) {
                min = arrayDig[i];
            }
            if (arrayDig[i] > max) {
                max = arrayDig[i];
            }
        }
        System.out.println(min+"  "+max);
    }
}
