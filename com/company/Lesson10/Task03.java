package com.company.Lesson10;

/**
 * Created by Toll on 13.07.2017.
 */

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать три метода, которые вызывают друг друга. Метод должен вернуть номер
строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Task03 {
    public static void main(String[] args) {
        System.out.println(first());
    }
    private static int first() {
        System.out.println(second());

        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getLineNumber();
    }

    private static int second() {
        System.out.println(third());
        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getLineNumber();
    }

    private  static int third() {
        StackTraceElement [] traceElement = Thread.currentThread().getStackTrace();
        return traceElement[2].getLineNumber();
    }
}
