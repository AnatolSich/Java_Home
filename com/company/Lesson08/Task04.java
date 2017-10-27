package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Toll on 08.07.2017.
 */

/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Task04 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map = adding();
        printing(map);
        getting(map);
    }

    private static Map adding() throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String tempStr = "0";
        while (true) {

            String str = bfr.readLine();
            i++;
            if (str.isEmpty()) break;
            if (i % 2 != 0) {
                tempStr = str;

            } else {
                map.put(tempStr, str);
            }
        }
        return map;
    }

    private static void printing(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void getting(Map<String, String> map) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String str = bfr.readLine();
            if (str.isEmpty()) break;
            Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                if (entry.getKey().equals(str))
                    System.out.println(entry.getValue());
            }
        }
    }
}
