package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/

public class Task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        double d = 0;
        double h = 0;
        do {
            d = Double.parseDouble(bfr.readLine());
            h = h + d;
            //      if (d == -1) break;


        } while (d != -1);
        System.out.println(h);
    }

}
