package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 01.06.2017.
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        System.out.println(str);

        int iii = Integer.parseInt(reader.readLine());
        System.out.println(iii);

    }
}
