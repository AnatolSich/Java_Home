package com.company.Lesson31;

/**
 * Created by Toll on 04.11.2017.
 */

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/

public class Task01 {

    public static void main(String[] args) {
        TestThread myThread =new TestThread();

        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }

    public static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
