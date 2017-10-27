package com.company.HomeWork.ThreeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 21.06.2017.
 */

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/

public class Demo {
    public static void main(String[] args) throws IOException {
        List<Double> list = new ArrayList();

        List<Double> list01 = new ArrayList();
        List<Double> list02 = new ArrayList();
        List<Double> list03 = new ArrayList();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            System.out.print(i+" ");
            Double d = Double.parseDouble(bfr.readLine());
            list.add(d);
        }

        for (int i = 0; i < list.size(); i++) {
            double d = list.get(i);
            if (d % 3 == 0 || d % 2 == 0) {
                if (d % 3 == 0) {
                    list01.add(d);
                }
                if (d % 2 == 0) {
                    list02.add(d);
                }
            } else list03.add(d);
        }
        System.out.println(list01);
        System.out.println(list02);
        System.out.println(list03);
    }

}
