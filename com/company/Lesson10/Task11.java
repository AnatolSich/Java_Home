package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 13.07.2017.
 */

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Task11 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws IOException {
        stringS();
    }

    private static void stringS() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();


        List<Character> glas = new ArrayList<>();
        List<Character> soglas = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            int k = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    glas.add(str.charAt(i));
                    k++;
                } else if (j == vowels.length - 1 && k == 0 && str.charAt(i)!=' ') soglas.add(str.charAt(i));
            }

        }
        for (Character ch : glas
                ) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (Character ch : soglas
                ) {
            System.out.print(ch + " ");
        }
    }
}
