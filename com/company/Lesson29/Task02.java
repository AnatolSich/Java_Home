package com.company.Lesson29;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toll on 28.10.2017.
 */
public class Task02 {
    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        int n = 40;
        Date date = new Date();
        fibonacciRow(n);
        Date endDate = new Date();
        long msDelay1 = endDate.getTime() - date.getTime();


        date = new Date();
        fibonacciRowCache(n);
        endDate = new Date();
        long msDelay2 = endDate.getTime() - date.getTime();

        System.out.println("Time distance is: " + msDelay1 + " ms.");
        System.out.println("Time distance is: " + msDelay2 + " ms.");


    }

    private static void fibonacciRow(int k) {

        for (int i = 0; i <= k; i++) {
            System.out.println(fibonacci(i));
        }

    }

    private static BigInteger fibonacci(int n) {

        if (n == 0) {
            cache.put(n, BigInteger.ZERO);
            return BigInteger.ZERO;
        } else {
            if (n == 1 || n == 2) {
                cache.put(n, BigInteger.ONE);
                return BigInteger.ONE;
            } else {
                BigInteger result = fibonacci(n - 1).add(fibonacci(n - 2));
                cache.put(n, result);
                return result;
            }
        }

    }

    private static void fibonacciRowCache(int k) {

        for (int i = 0; i <= k; i++) {
            System.out.println(fibonacciCache(i));
        }

    }

    private static BigInteger fibonacciCache(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        else {
            if (n == 0) {
                cache.put(n, BigInteger.ZERO);
                return BigInteger.ZERO;
            } else {
                if (n == 1 || n == 2) {
                    cache.put(n, BigInteger.ONE);
                    return BigInteger.ONE;
                } else {
                    BigInteger result = fibonacciCache(n - 1).add(fibonacciCache(n - 2));
                    cache.put(n, result);
                    return result;
                }
            }
        }
    }
}
