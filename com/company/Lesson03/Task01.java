package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* 10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
*/

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Task01 {

    public static void main(String[] args) throws IOException {
      //  int i=1;
     /*   while (i <=10) {
            System.out.println(i);
            i++;
        }*/


       /* for (int j = 0; j <= 100; j+=2) {
            System.out.print(j +" ");
        }*/

       BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
       int m = Integer.parseInt(bfr.readLine());
       int n = Integer.parseInt(bfr.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
                if (j==n-1) System.out.println();
            }

        }

    }

}
