package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 08.07.2017.
 */
public class Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = bfr.readLine();
        }

        sort(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void sort(String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(isGreaterThen(array[j], array[j+1])){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }
}
