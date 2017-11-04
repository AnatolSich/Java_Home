package com.company.Lesson31;

/**
 * Created by Toll on 04.11.2017.
 */

/* My second thread
1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
*/

public class Task02 {
    public static void main(String[] args) {
        new TestThread().start();
    }

    public static class TestThread extends Thread{

        static {
            System.out.println("it's static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's run method");
        }


    }
}
