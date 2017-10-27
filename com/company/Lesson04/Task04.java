package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 22.06.2017.
 */

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Task04 {
    public static void main(String[] args) throws IOException {
        List<Integer> digits = twoDigit();
        printList(moving(digits.get(1),adding(digits.get(0))));
    }
    private static List <Integer> twoDigit () throws IOException {
        List<Integer> digits = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            digits.add(Integer.parseInt(bfr.readLine()));
        }
        if(digits.get(0)<digits.get(1)) {
            int i = digits.get(0);
            digits.set(0,digits.get(1));
            digits.set(1,i);
        }
        return digits;
    }
    private static List<String> adding(int n) throws IOException {
        List<String> words = new ArrayList<>();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            words.add(bfr.readLine());
        }
        return words;
    }

    private static List<String> moving(int m, List<String> list){
        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        return list;
    }

    private static void printList (List <String> list){
        for (String str: list) {
            System.out.println(str);
        }
    }
}
