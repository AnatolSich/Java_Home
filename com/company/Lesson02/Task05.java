package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.06.2017.
 */

/*Реализовать метод closeToTen.
        Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
        Например, среди чисел 8 и 11 ближайшее к десяти 11.
        Если оба числа на равной длине к 10, то вывести на экран любое из них.*/

public class Task05 {
    public static void main(String[] args) throws IOException {
       BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First");
        double dd1 = Double.parseDouble(bfr.readLine());
         System.out.println("Second");
        double dd2 = Double.parseDouble(bfr.readLine());
        System.out.println(sravnenie(dd1,dd2));
    }

    public static double sravnenie (double ... dd) {
        if (Math.abs(dd[0]-10)<= Math.abs(dd[1]-10))
            return dd[0];
        else return dd[1];
    }

}
