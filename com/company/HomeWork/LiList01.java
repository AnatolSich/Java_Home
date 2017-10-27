package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Toll on 14.06.2017.
 */

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class LiList01 {

    public static void main(String[] args) throws IOException {

        LinkedList<String> lilist = new LinkedList();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            lilist.add(bfr.readLine());
        }
        Iterator<String> iter = lilist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (int i = 0; i < 13; i++) {
            lilist.addFirst(lilist.getLast());
            lilist.removeLast();
        }

        Iterator<String> iter2 = lilist.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

    }
}
