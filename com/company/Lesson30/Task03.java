package com.company.Lesson30;

/**
 * Created by Toll on 02.11.2017.
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println(nod(24,12));
    }

    private static int nod(int a, int b) {
        if (b > a) {
            int k = b;
            b = a;
            a = k;
        }
        while (true) {
            int n = a % b;
            if (n == 0) return b;
            else {
                a = b;
                b = n;
            }
        }
    }
}
