package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 17.08.2017.
 */

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

public class Test01 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bff = new BufferedReader(new FileReader(bfr.readLine()));
        while (true) {
            String str = bff.readLine();

            if (str == null) break;
            Integer i = Integer.parseInt(str);
            if (i % 2 == 0) list.add(i);
        }
        sorting(list);
        System.out.println(list);


    }

    static List sorting(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) list.set(j + 1, list.set(j, list.get(j + 1)));
            }
        }
        return list;
    }

}
