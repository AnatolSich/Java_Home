package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 22.06.2017.
 */

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Task03 {
    public static void main(String[] args) throws IOException {
        printList(adding());
    }

    private static List<Integer> adding() throws IOException {
        List<Integer> words = new ArrayList<>();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            words.add(Integer.parseInt(bfr.readLine()));
        }
        return words;
    }
    private static void printList (List <Integer> list){
        for (int i=list.size()-1; i>-1; i--) {
            System.out.println(list.get(i));
        }
    }

}
