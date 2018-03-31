package com.company.Interview;

public class NodTest {

    public static void main(String[] args) {
        System.out.println(nod(-8, 72));
        System.out.println(nod_1(8, 72));
        System.out.println(nod_2(0, 72));
        System.out.println(nod_3(0, 72));
    }

    private static int nod(int a, int b) {
        if (a == 0 & b != 0) return b;
        if (a != 0 & b == 0) return a;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (true) {
            int temp = a % b;
            if (temp != 0) {
                a = b;
                b = temp;
            } else return Math.abs(b);
        }
    }

    private static int nod_1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Math.abs(nod_1(b, a % b));
    }

    private static int nod_2(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    private static int nod_3(int a, int b) {
        if (a == 0 & b != 0) return b;
        if (a != 0 & b == 0) return a;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b -a;
            }
        }
        return Math.abs(a);
    }

}
