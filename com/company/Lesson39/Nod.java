package com.company.Lesson39;

public class Nod {
    public static void main(String[] args) {
        System.out.println(nod(9,33));
    }

    private static int nod(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
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
