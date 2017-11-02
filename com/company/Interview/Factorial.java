package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toll on 28.10.2017.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(2));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int n){
        BigInteger res;

        if(n == 0) return BigInteger.ONE;

        if(cache.containsKey(n)){
            System.out.println("Cache");
            return cache.get(n);
        }

        res = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, res);
        return res;
    }

    public static void m() {
        int a=3;
        int b=1;
        for (int i = 1; i <= a; i++) {
            //b=b*(a-i);
            b*=i;
        }
        System.out.println(b);
    }

}
