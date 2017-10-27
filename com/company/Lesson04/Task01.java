package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Toll on 22.06.2017.
 */

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {


        printList(doubleValues(adding()));


    }



   private static List<String> adding() throws IOException {
        List <String> words = new ArrayList<>();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            words.add(bfr.readLine());
        }
        return words;
    }

    private static List<String> doubleValues (List <String> list) {
        List <String> listTemp = new ArrayList<>();
        for (String str:list) {
            listTemp.add(str);
            listTemp.add(str);
        }
        return listTemp;
    }

    private static void printList (List <String> list){
        for (String str: list) {
            System.out.println(str);
        }
    }
}


