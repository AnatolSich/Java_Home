package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Toll on 14.10.2017.
 */
public class Task02 {
    public static void main(String[] args) throws IOException {
        sorting(creating());
    }

    private static Integer[] creating() throws IOException {
        List<Integer> list = new ArrayList<>();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;

            list.add(Integer.parseInt(str));
        }


        Integer[] array = list.toArray(new Integer[list.size()]);
        return array;
    }

    private static void sorting(Integer[] array) {
        int count = 0;
        boolean flag = true;
        for (int i = 0; flag; i++) {
            count++;
            flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j+1] > array[j]) {
                    flag = true;
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                }
            }
        }

        for (int i: array
             ) {
            System.out.print(i+" ");
        }

        System.out.println(count);
    }

}
