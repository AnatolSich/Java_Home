package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Toll on 14.06.2017.
 */

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class ListMy02 {

    public static void main(String[] args) throws IOException {

        LinkedList <String> liList = new LinkedList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            liList.addFirst(bfr.readLine());
        }
        Iterator<String> iter = liList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
