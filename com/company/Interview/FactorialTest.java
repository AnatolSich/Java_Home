package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialTest {
    private static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " " + fact(i));
        }
    }

    private static BigInteger fact(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        if (n == 0 || n == 1) {
            cache.put(n, BigInteger.ONE);
            return BigInteger.ONE;
        }

        BigInteger res = BigInteger.valueOf(n).multiply(fact(n - 1));

        cache.put(n, res);
        return res;
    }
}
