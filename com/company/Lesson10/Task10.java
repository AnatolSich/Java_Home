package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

/**
 * Created by Toll on 13.07.2017.
 */

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Task10 {
    public static void main(String[] args) throws IOException {
        readData();
    }
    private static void readData() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean flag = true;
            while (flag) {
                String str = bfr.readLine();
                list.add(Integer.parseInt(str));
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
            for (Integer i :list
                 ) {
                System.out.print(i+" ");
            }
        }

    }
}
