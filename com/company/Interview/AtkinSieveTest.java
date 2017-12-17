package com.company.Interview;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.BitSet;

public class AtkinSieveTest {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("ss:SSS");
    static SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss:SSS");

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Date start = new Date();
        System.out.println(dateFormat2.format(start.getTime()));
        /*Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();*/
        // BitSet primes = AtkinSieve.getPrimesUpTo(10000,99999);
        BitSet primes = AtkinSieve.getPrimesUpTo(99999);
        // Вывод последовательности
        for (int number = 10000; number <= 99999; ++number)
            if (primes.get(number))
                list.add(number);
      /*  for (int i:list
             ) {
            System.out.print(i+"  ");
        }*/

        // System.out.println(list.get(list.size()-1));

        System.out.println(maxNumber(list));
        Date finish = new Date();
        System.out.println(dateFormat2.format(finish.getTime()));
        System.out.println(dateFormat.format(finish.getTime() - start.getTime()) + " sec");
    }

    private static String maxNumber(List<Integer> list) {
        long res = 0L;
        long res1 = 0L;
        long res2 = 0L;
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                long n1 = list.get(i);
                long n2 = list.get(j);
                long proz = n1 * n2;
                String str = String.valueOf(proz);
                if (isPalindrome(str) & proz > res) {
                    res1=n1;
                    res2=n2;
                    res = proz;
                }
            }
        }
        System.out.println(res1);
        System.out.println(res2);
        return String.valueOf(res);
    }

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
}

 class AtkinSieve {
    public static BitSet getPrimesUpTo (int limit) {
        BitSet sieve = new BitSet();
        // Предварительное просеивание
        for (long x2 = 1L, dx2 = 3L; x2 < limit; x2 += dx2, dx2 += 2L)
            for (long y2 = 1L, dy2 = 3L, n; y2 < limit; y2 += dy2, dy2 += 2L) {
                // n = 4x² + y²
                n = (x2 << 2L) + y2;
                if ( n <= limit && (n % 12L == 1L || n % 12L == 5L))
                    sieve.flip((int)n);
                // n = 3x² + y²
                n -= x2;
                if ( n <= limit && n % 12L == 7L)
                    sieve.flip((int)n);
                // n = 3x² - y² (при x > y)
                if (x2 > y2) {
                    n -= y2 << 1L;
                    if ( n <= limit && n % 12L == 11L)
                        sieve.flip((int)n);
                }
            }
        // Все числа, кратные квадратам, помечаются как составные
        int r = 5;
        for (long r2 = r * r, dr2 = (r << 1L) + 1L; r2 < limit; ++r, r2 += dr2, dr2 += 2L)
            if (sieve.get(r))
                for (long mr2 = r2; mr2 < limit; mr2 += r2)
                    sieve.set((int)mr2, false);
        // Числа 2 и 3 — заведомо простые
        if (limit > 2)
            sieve.set(2, true);
        if (limit > 3)
            sieve.set(3, true);
        return sieve;
    }
}