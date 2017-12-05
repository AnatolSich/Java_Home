package com.company.Lesson38;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 30.11.2017.
 */
public class Task01 {
    public static void main(String[] args) {
      //  System.out.println(isInt("2"));
        List<String> listIn = new ArrayList<>();
        listIn.add("wer");
        listIn.add("4");
        listIn.add("t");
        listIn.add("rf");
        listIn.add("klkl");
        listIn.add("87");
        listIn.add("08907");
        listIn.add("5.7");
        listIn.add("0.2");

        for (int i = 0; i < listIn.size(); i++) {
            System.out.print(listIn.get(i) + " ");
        }
        List<String> listOut = sorting(listIn);

        for (int i = 0; i < listOut.size(); i++) {
            System.out.print(listOut.get(i) + " ");
        }
    }

    private static List<String> sorting(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (isDigital(str)) {
                int j = i + 1;
                while (!isDigital(list.get(j))) {
                    j++;
                }
                String str2 = list.get(j);
                if (str.compareTo(str2) > 0) {
                    String temp = str;
                    str = str2;
                    str2 = temp;
                }
            } else {
                if (isInt(str)) {
                    int n = Integer.valueOf(str);
                    int k = i + 1;
                    while (isInt(list.get(k))) {
                        k++;
                    }
                    int h = Integer.valueOf(list.get(k));
                    if (n > h) {
                        int temp = n;
                        n = h;
                        h = temp;
                    }
                } else {
                    double n = Double.valueOf(str);
                    int k = i + 1;
                    while (isInt(list.get(k))) {
                        k++;
                    }
                    double h = Double.valueOf(list.get(k));
                    if (n > h) {
                        double temp = n;
                        n = h;
                        h = temp;
                    }
                }


            }

        }
        return list;
    }

    private static boolean isInt(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDigital(String str) {
        boolean i;
        boolean d;
        try {
            Integer.valueOf(str);
            i = true;
        } catch (NumberFormatException e) {
            i = false;
        }
        try {
            Double.valueOf(str);

            d = true;
        } catch (NumberFormatException e) {
            d = false;
        }
        if (i || d) return true;
        else return false;


    }
}
