package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

/**
 * Created by Toll on 15.07.2017.
 */

/* Задача по алгоритмам
        Задача: Пользователь вводит с клавиатуры список слов (и чисел).
        Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
        Вишня
        1
        Боб
        3
        Яблоко
        2
        0
        Арбуз
        Пример вывода:
        Арбуз
        3
        Боб
        2
        Вишня
        1
        0
        Яблоко
*/

public class Task05 {
    public static void main(String[] args) throws IOException {
        List<String> startList = adding();
        List[] massiv = dividing(startList);
        printing(startList, massiv[0], massiv[1]);

    }

    private static List adding() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bfr.readLine();
            if (!str.isEmpty()) list.add(str);
            else break;
        }
        return list;

    }

    private static List[] dividing(List<String> list) {
        List<String> listStr = new ArrayList<>();
        List<Integer> listDig = new ArrayList<>();
        List[] massiv = {listStr, listDig};
        for (String s : list) {
            if (isString(s)) listStr.add(s);
            else listDig.add(Integer.parseInt(s));
        }
        sortingString(massiv[0]);
        sortingDigit(massiv[1]);
        return massiv;
    }

    private static boolean isString(String str) {
        try {
            Integer i = Integer.parseInt(str);
            return false;

        } catch (Exception e) {
            return true;
        }


    }

    private static List sortingDigit(List listIn) {
        for (int i = 0; i < listIn.size(); i++) {
            for (int j = 0; j < listIn.size() - i - 1; j++) {
                if ((Integer) listIn.get(j) > (Integer) listIn.get(j + 1)) {
                    listIn.set(j, listIn.set(j + 1, listIn.get(j)));
                }
            }
        }
        return listIn;
    }

    private static List sortingString(List listIn) {
        for (int i = 0; i < listIn.size(); i++) {
            for (int j = 0; j < listIn.size() - i - 1; j++) {
                if (listIn.get(j).toString().compareTo(listIn.get(j + 1).toString()) > 0) {
                    listIn.set(j, listIn.set(j + 1, listIn.get(j)));
                }
            }
        }
        return listIn;

    }

    private static void printing(List<String> startList, List<String> listStr, List<Integer> listDig) {
        int iStr = 0;
        int iDig = 0;
        for (String str : startList
                ) {
            if (isString(str)) {
                System.out.println(listStr.get(iStr));
                iStr++;
            } else {
                System.out.println(listDig.get(iDig));
                iDig++;
            }
        }
    }
}
