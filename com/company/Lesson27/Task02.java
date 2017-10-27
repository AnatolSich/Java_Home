package com.company.Lesson27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 21.10.2017.
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

public class Task02 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine().trim();
      //  System.out.println(str);
        char[] ch = str.toCharArray();

        StringBuffer strA = new StringBuffer();
        StringBuffer strB = new StringBuffer();
        for (char c : ch
                ) {
            if (isVowel(c)) strA.append(" " + c);
            else if (c != ' ') strB.append(" " + c);
        }

        System.out.println(strA);
        System.out.println(strB);
    }

    private static boolean isVowel(char c) {
        for (char c2 : vowels
                )
            if (("" + c).equalsIgnoreCase(("" + c2)))
                return true;
        return false;
    }
}
