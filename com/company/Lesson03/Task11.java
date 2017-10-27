package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 10.06.2017.
 */

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Task11 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<String> myList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            myList.add(bfr.readLine());
        }

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() > myList.get(i+1).length()) myList.remove(i+1);
            else if (myList.get(i).length() < myList.get(i+1).length()) {
                myList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}
