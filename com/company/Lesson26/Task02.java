package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Toll on 19.10.2017.
 */

public class Task02 {
    public static void main(String[] args) throws IOException {
        sorting(creating());

    }

    private static void sorting(String[] array) {
        String[] tempArray1 = new String[array.length];
        String[] tempArray2 = new String[array.length];

        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (isDigit(array[i])) {
                tempArray1[i] = array[i];
                k1++;
            } else {
                tempArray2[i] = array[i];
                k2++;
            }
        }
        Integer[] intArray = new Integer[k1];
        String[] strArray = new String[k2];
        int m = 0;
        for (String str : tempArray1
                ) {
            if (str != null)
                intArray[m++] = Integer.parseInt(str);
        }
        m = 0;
        for (String str : tempArray2
                ) {
            if (str != null)
                strArray[m++] = str;
        }
        Integer[] intArray2 = sortingInteger(intArray);
        String[] strArray2 = sortingString(strArray);
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < array.length; i++) {

            if (isDigit(array[i]))
                array[i] = intArray2[n1++].toString();

            else array[i] = strArray2[n2++];
        }


        for (String str : array
                ) {
            System.out.print(str + " ");
        }


    }

    private static boolean isDigit(String str) {
        try {
            Integer i = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static Integer[] sortingInteger(Integer[] array) {
        boolean flag = true;
        for (int i = 0; flag; i++) {

            flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    flag = true;
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }

        }


        return array;
    }

    private static String[] sortingString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String str = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = str;
                }
            }
        }

        return array;
    }

    private static String[] creating() throws IOException {
        int n = 6;
        System.out.println("Enter " + n + " values:");
        String[] array = new String[n];

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {


            array[i] = bfr.readLine();
        }

        return array;
    }
}
