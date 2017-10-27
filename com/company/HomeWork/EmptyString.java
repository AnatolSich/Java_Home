package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Toll on 28.06.2017.
 */

/* Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/


public class EmptyString {
    public static void main(String[] args) throws IOException {
        printing(changing(adding()));
    }

    private static List adding() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            else list.add(str);
        }
        return list;
    }

    private static List changing(List<String> list) {
        for (String str : list
                ) {
            if (str.length() % 2 == 0) list.set(list.indexOf(str), str + " " + str);
            else list.set(list.indexOf(str), str + " " + str + " " + str);
        }
        return list;
    }

    private static void printing(List list){
        Iterator <String> iter = list.iterator();
        while (iter.hasNext()) System.out.println(iter.next());
    }
}
