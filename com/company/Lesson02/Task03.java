package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.06.2017.
 */
public class Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        // < > == !
        // && - and
        // || - or
        System.out.println("Введите 1е число");
        double dd1 = Double.parseDouble(bfr.readLine());
        System.out.println("Введите 2е число");
        double dd2 = Double.parseDouble(bfr.readLine());
        System.out.println("Введите 3е число");
        double dd3 = Double.parseDouble(bfr.readLine());
        System.out.println("Введите 4е число");
        double dd4 = Double.parseDouble(bfr.readLine());

        System.out.println(sravnenie(dd1, dd2, dd3, dd4));


    }

    public static double sravnenie(double... dd) {
        if (dd[0] > dd[1] && dd[0] > dd[2] && dd[0] > dd[3]) {
            return dd[0];
        } else if (dd[1] > dd[0] && dd[1] > dd[2] && dd[1] > dd[3]) {
            return dd[1];
        } else if (dd[2] > dd[1] && dd[2] > dd[0] && dd[2] > dd[3]) {
            return dd[2];
        } else return dd[3];
    }

}
