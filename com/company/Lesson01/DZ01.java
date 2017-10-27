package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Toll on 08.06.2017.
 */

/* Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет. */



/* Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

Пример:
Я буду зарабатывать $50 в час */

public class DZ01 {

    public static void main(String[] args) throws IOException {

        InputStreamReader istr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(istr);

        System.out.println("Введите имя");
        String imja = bfr.readLine();

        System.out.println("Введите сумму за месяц");
        double summaVmes = Double.parseDouble(bfr.readLine());

        System.out.println("Введите колл-во лет");
        int let = Integer.parseInt(bfr.readLine());

        System.out.format("%s получает %f через %d лет", imja, summaVmes, let);
        System.out.println();

        System.out.println("Введите сумму в час");
        double summVchas = Double.parseDouble(bfr.readLine());

        while (summVchas > summaVmes / (20 * 8) || summVchas < summaVmes / (22 * 8)) {
            System.out.println("Неверное значение");
            System.out.println("Введите сумму в час");
            summVchas = Double.parseDouble(bfr.readLine());
        }

        System.out.format("Я (%s) буду зарабатывать %f в час", imja, summVchas);
    }
}
