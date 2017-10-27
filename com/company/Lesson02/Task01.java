package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.06.2017.
 * 1 - convert USD -> UAH
 * 2 - kvadrat
 * 3 - 4 - String
 * 4 - number -> number + 10% number
 */
public class Task01 {
    public static void main(String... args) throws IOException {
        InputStreamReader istrm = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(istrm);
        int i = Integer.parseInt(reader.readLine());
        switch (i) {
            case 1: {
                System.out.println("Доллары");
                double dollar = Double.parseDouble(reader.readLine());
                System.out.println(dol(dollar));
                break;
            }
            case 2: {
                System.out.println("Квадрат");
                double kvad = Double.parseDouble(reader.readLine());
                System.out.println(kvad(kvad));
                break;
            }
            case 3: {
                System.out.println("Строка");
                String str = reader.readLine();
                pechat(str);
                break;
            }
            case 4: {
                System.out.println("Процент");
                double dd = Double.parseDouble(reader.readLine());
                System.out.println(procent(dd));
                break;
            }
        }



    }

    public static double dol (double d){
        return d*27;
    }
    public static double kvad (double d) {
        return Math.pow(d,2);
    }
    public static void pechat (String str) {
        for (int i = 0; i < 4; i++) {
            System.out.println(str);
        }
    }
    public static double procent (double d){
        return d*1.1;
    }
}
