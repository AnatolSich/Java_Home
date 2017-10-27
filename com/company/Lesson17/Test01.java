package com.company.Lesson17;

/**
 * Created by Toll on 10.08.2017.
 *
 * Hello - ref1
 * Hello - ref2
 * a = Hello ref1
 * b = Hello ref1
 */
public class Test01 {
}

class Compare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}