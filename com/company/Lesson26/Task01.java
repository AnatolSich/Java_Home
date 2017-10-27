package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Toll on 19.10.2017.
 */
public class Task01 {
    public static void main(String[] args) throws IOException {
        sorting(creating());
    }
   /* private static void sorting(String... str) {
        for (int i = 0; i < str.length - 1; ) {
            int j = i + 1;

            if (str[i].compareTo(str[j]) > 0) {
                String tempStr = str[i];
                str[i] = str[j];
                str[j] = tempStr;
                if (i > 0) {
                    i--;
                }
            } else i++;
        }
    }*/

    private static void sorting(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String str = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = str;
                }
            }
        }
        for (String str:array
             ) {
            System.out.print(str+" ");
        }
    }

    private static String[] creating() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            list.add(str);
        }
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }


}
