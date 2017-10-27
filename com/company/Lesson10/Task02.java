package com.company.Lesson10;

import static com.oracle.jrockit.jfr.ContentType.StackTrace;

/**
 * Created by Toll on 13.07.2017.
 */

/*
Написать три метода, которые вызывают друг друга.
Каждый метод должен возвращать имя метода,
вызвавшего его, полученное с помощью StackTrace.
*/

public class Task02 {
    public static void main(String[] args) {
        System.out.println(first());
    }

    private static String first() {
        System.out.println(second());

        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getMethodName();
    }

    private static String second() {
        System.out.println(third());
        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getMethodName();
    }

    private  static String third() {
        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getMethodName();
    }
}
