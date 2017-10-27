package com.company.Lesson22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 31.08.2017.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        List <Integer> list = creating();
        System.out.println(nod(list.get(0),list.get(1)));
    }

    public static int nod(int a, int b) {
        if (b == 0) return a;

        return nod(b, a % b);
    }

    private static List<Integer> creating() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(Integer.parseInt(bfr.readLine()));
        }
        return list;
    }
}
