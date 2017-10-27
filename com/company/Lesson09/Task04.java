package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Toll on 08.07.2017.
 */

public class Task04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            else list.add(str);
        }
        String[] str2 = new String[list.size()];
        sorting(list.toArray(str2));

        for (String str : str2
                ) {
            System.out.println(str);
        }

    }

    private static void sorting(String... str) {
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
    }
}
