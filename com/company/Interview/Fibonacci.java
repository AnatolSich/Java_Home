package com.company.Interview;

/**
 * Created by Toll on 28.10.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int k = 11;
        for (int i = 1; i <= k ; i++) {
            System.out.println(f(i));
        }
    }

    private static int f(int n){
        if(n <= 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else if(n == 2){
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
