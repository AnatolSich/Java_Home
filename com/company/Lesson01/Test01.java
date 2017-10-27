package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 01.06.2017.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        int a = 7; // 5
        int b = 5; // 10
        int c = 10; // 7
        int d = a;

        a = b; //5
        b = c; //10
        c = d; //7
        System.out.format("%d %d %d", a, b, c);
        System.out.println();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int y = Integer.parseInt(s);
        int y1 = Integer.parseInt(reader.readLine());

        System.out.println(s);
        System.out.println(y * y1);
    }
}
