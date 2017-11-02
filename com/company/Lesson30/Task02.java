package com.company.Lesson30;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toll on 02.11.2017.
 */

public class Task02 {
    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i)+" ");
        }

    }

    private static BigInteger fibo(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1 || n == 2) return BigInteger.ONE;
        if (cache.containsKey(n)) return cache.get(n);
        BigInteger temp = fibo(n - 1).add(fibo(n - 2));
        cache.put(n, temp);
        return temp;

    }
}
