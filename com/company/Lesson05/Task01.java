package com.company.Lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Toll on 24.06.2017.
 */

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {

        printing(adding());

    }

    private static List adding () throws IOException {
        List <String> strings = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();

        while (!str.toLowerCase().equals("end"))   {
            strings.add(str);
            str=bfr.readLine();
        }
        return strings;
    }
    private static void printing (List list) {
        Iterator <String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }
        if (list.isEmpty()) System.out.println("ok");
        else System.out.println("no");
    }
}
