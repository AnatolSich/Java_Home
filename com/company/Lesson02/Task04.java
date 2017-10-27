package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.06.2017.
 */

/*
Реализовать метод checkInterval.
        Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
        "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.
*/
public class Task04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        double dd = Double.parseDouble(bfr.readLine());
        if (checkInterval(dd)) System.out.printf("Число %f содержится в интервале.", dd);
        else System.out.printf("Число %f не содержится в интервале.",dd);
    }

    public static boolean checkInterval(double d) {
        if (d <= 100 && d >= 50) return true;
        else return false;

    }
}
