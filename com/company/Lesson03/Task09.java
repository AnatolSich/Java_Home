package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* Один большой массив и два маленьких
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Task09 {

    public static void main(String[] args) throws IOException {

        double[] dig = new double[10];
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < dig.length; i++) {

            dig[i] = Double.parseDouble(bfr.readLine());

        }
        double[] dig1 = new double[5];
        double[] dig2 = new double[5];

        for (int i = 0; i < dig.length; i++) {
            if (i < dig.length / 2) dig1[i] = dig[i];
            else dig2[i - dig.length / 2] = dig[i];
        }
        for (int i = 0; i < dig2.length; i++) {
            System.out.println(dig2[i]);
        }
    }
}
