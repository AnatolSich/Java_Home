package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class Fact {
    private static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fact(1000));

    }

    private static BigInteger fact(int n) {
        BigInteger res;
        if (cache.containsKey(n)) res = cache.get(n);
        else if (n == 0 || n == 1) res = BigInteger.ONE;
        else {
            res = BigInteger.valueOf(n).multiply(fact(n - 1));
            cache.put(n, res);
        }
        return res;
    }
}
