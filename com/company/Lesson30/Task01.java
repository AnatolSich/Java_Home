package com.company.Lesson30;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toll on 02.11.2017.
 */
public class Task01 {

    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(factorial(50));
        System.out.println(factorial(50));
    }


    private static BigInteger factorial(int n) {


        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        if (cache.containsKey(n)) {

            System.out.println("cache");
            return cache.get(n);
        }

        BigInteger temp = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, temp);


        return temp;

    }

}
