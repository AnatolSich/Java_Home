package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciTest {
    private static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " " + fibo(i));
        }
    }

    private static BigInteger fibo(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        if (n == 0) {
            cache.put(n, BigInteger.ZERO);
            return BigInteger.ZERO;
        }
        if (n == 1) {
            cache.put(n, BigInteger.ONE);
            return BigInteger.ONE;
        }

        BigInteger res = fibo(n - 1).add(fibo(n - 2));

        cache.put(n, res);
        return res;

    }
}
