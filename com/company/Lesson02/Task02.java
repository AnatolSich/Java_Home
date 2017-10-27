package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.06.2017.
 */
public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        // < > == !
        // && - and
        // || - or
        System.out.println("Введите 1е число");
        double dd1 = Double.parseDouble(bfr.readLine());
        System.out.println("Введите 2е число");
        double dd2 = Double.parseDouble(bfr.readLine());

        System.out.println(sravnenie(dd1, dd2));


    }

    public static double sravnenie(double... dd) {
        if (dd[0] >= dd[1]) return dd[0];
        else return dd[1];
    }

}
