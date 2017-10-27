package com.company.Lesson10;

/**
 * Created by Toll on 13.07.2017.
 *
 * Throwable
 *  - Error unchecked
 *  - Exception unchecked/checked
 *   - RuntimeException unchecked
 *   - IOException checked
 *
 *
 */
public class Task01 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1(){
        m2();
    }

    private static void m2(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.err.println(element);
        }
    }
}
