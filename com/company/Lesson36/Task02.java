package com.company.Lesson36;

/**
 * Created by Toll on 23.11.2017.
 */

/* Отсчет на гонках
1. В выполняющем классе создать статическую переменную int countSeconds, присвоить ей значение 3
2. Создать класс RacingClock, унаследовать его от Thread
3. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
4. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
5. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
*/

public class Task02 {
    static int countSeconds = 4;

    public static void main(String[] args) {
        RacingClock racingClock = new RacingClock();
        racingClock.start();
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        racingClock.interrupt();


    }
}

class RacingClock extends Thread {
    int count = 0;


    @Override
    public void run() {
        try {
            while (!this.isInterrupted()) {
                Thread.sleep(1000);
                System.out.println(Task02.countSeconds - count);
                count++;
            }
        } catch (InterruptedException e) {
            if (Task02.countSeconds - count >0)
                System.out.println("Прервано!");
            else System.out.println("Марш!");
        }
    }
}