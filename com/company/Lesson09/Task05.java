package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Character.isDigit;

/**
 * Created by Toll on 08.07.2017.
 */

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Task05 {
    static int method = 0;

    public static void main(String[] args) throws Exception {
        List<Integer> list = getIntegerList(getNember());
        try {
            System.out.println(getMinimum(list));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static int getNember() throws IOException {
        System.out.println("Enter number");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();
        int k = 0;
        for (int i = 0; i < str.length(); i++) {

            if (!isDigit(str.charAt(i))) k++;
        }
        if (str.isEmpty() || k > 0) {
            System.out.println("Exit");
            throw new IndexOutOfBoundsException();
        } else {
            method = Integer.parseInt(str);
            return Integer.parseInt(str);
        }


    }

    private static List getIntegerList(int t) throws IOException {
        System.out.println("Enter " + t + " positive numbers");
        List<Integer> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag) {
            String str = bfr.readLine();
            int k = 0;
            for (int i = 0; i < str.length(); i++) {

                if (!isDigit(str.charAt(i))) k++;
            }
            if (str.isEmpty() || k > 0) {
                flag = false;
            } else list.add(Integer.parseInt(str));
        }
        return list;


    }

    private static int getMinimum(List<Integer> list) {
        if (method % 2 != 0) return getMinimum1(list);
        else return getMinimum2(list);
    }


    private static int getMinimum1(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                list.set(i, list.set(i + 1, list.get(i)));
            }
        }
        System.out.println("Method № 1");
        return list.get(list.size() - 1);
    }

    private static int getMinimum2(List<Integer> list) {
        Collections.sort(list);
        System.out.println("Method № 2");
        return list.get(0);
    }


}
