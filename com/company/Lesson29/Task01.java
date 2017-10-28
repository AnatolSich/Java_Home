package com.company.Lesson29;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toll on 28.10.2017.
 */
public class Task01 {
    static Map<Integer,BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(factorial(52));
    }

    private static BigInteger factorial(int a){
        if (a==0) return BigInteger.ONE;
        if (cache.containsKey(a)) return cache.get(a);

        BigInteger result = BigInteger.valueOf(a).multiply(factorial(a-1));
        cache.put(a,result);
        return result;
    }
}
