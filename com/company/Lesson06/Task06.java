package com.company.Lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Toll on 29.06.2017.
 */

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 10 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/

public class Task06 {
    public static void main(String[] args) throws IOException {
        removeAllNumbersMoreThan10(creating());
    }

    private static Set<Integer> creating() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> integers = new HashSet<>();
        while (true) {
            String str = bfr.readLine();

            if (!str.isEmpty()) integers.add(Integer.parseInt(str));
            else break;
        }
        return integers;
    }

    private static void removeAllNumbersMoreThan10(Set<Integer> set) {
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer temp = iter.next();
            if (temp > 10) iter.remove();
        }
        Iterator<Integer> iter2 = set.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
