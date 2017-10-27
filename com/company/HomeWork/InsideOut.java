package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Toll on 28.06.2017.
 */

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в убывающем порядке.
*/


public class InsideOut {
    public static void main(String[] args) throws IOException {
        printing(changing(adding()));
    }

    private static List adding() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            else list.add(Integer.parseInt(str));
        }
        return list;
    }

    private static List changing(List <Integer> list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        return list;
    }

    private static void printing(List list){
        Iterator <Integer> iter = list.iterator();
        while (iter.hasNext()) System.out.println(iter.next());
    }
}
