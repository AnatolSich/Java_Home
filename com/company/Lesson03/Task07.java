package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Task07 {

    public static void main(String[] args) throws IOException {
        String [] str = new String [10];
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            str[i]=bfr.readLine();
        }
        for (int i = str.length; i > 0; i--) {
            System.out.println(str[i-1]);
        }
    }
}
