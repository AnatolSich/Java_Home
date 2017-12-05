package com.company.Lesson39;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factor {
    private static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fact(255));
    }

    private static BigInteger fact(int n) {
        BigInteger nB = BigInteger.valueOf(n);

        if (cache.containsKey(n)) return cache.get(n);

        if (nB.equals(BigInteger.ONE)) return BigInteger.ONE;

        BigInteger res = nB.multiply(fact(n - 1));
        cache.put(n, res);
        return res;
    }
}
