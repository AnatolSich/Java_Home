package com.company.Lesson39;

import java.util.HashMap;
import java.util.Map;

public class Fibo {
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibo(25));

    }

    private static int fibo(int n) {
        if (cache.containsKey(n)) return cache.get(n);

        int res;
        if (n == 1) {
            cache.put(n, 0);
            return 0;
        }
        if (n == 2) {
            cache.put(n, 1);
            return 1;
        }

        res = fibo(n - 1) + fibo(n - 2);
        cache.put(n, res);
        return res;
    }
}
