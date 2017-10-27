package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.07.2017.
 */

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {
        printing();
    }

    private static void printing() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();
        String[] strMass = str.split(" ");

        for (int i = 0; i < strMass.length; i++) {
            if (!(strMass[i].isEmpty() | strMass[i].equals(" "))) {
                if (i == strMass.length - 1) {
                    strMass[i] = strMass[i].toUpperCase().charAt(0) + strMass[i].substring(1, strMass[i].length());
                    System.out.print(strMass[i]);
                } else {
                    strMass[i] = strMass[i].toUpperCase().charAt(0) + strMass[i].substring(1, strMass[i].length());
                    System.out.print(strMass[i] + " ");
                }

            } else System.out.print(" ");
        }

    }
}
