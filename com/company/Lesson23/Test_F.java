package com.company.Lesson23;

/**
 * Created by Toll on 02.09.2017.
 */

public class Test_F {

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for ( foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
        for (int j = 0; j < 5; j++) {

            System.out.println();

        }

    }
}