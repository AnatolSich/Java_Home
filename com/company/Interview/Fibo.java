package com.company.Interview;

public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int res = fibo(n - 1) + fibo(n - 2);
        return res;
    }
}
