package com.company.Lesson35;

import com.company.Lesson34.Task02;

/**
 * Created by Toll on 18.11.2017.
 */

/* Big Ben clock
1. В выполняющем классе создать приватную переменную isStopped, присвоить ей значение false
2. Создать класс Clock, унаследовать его от Thread
3. В классе Clock:
- создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
- создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
- создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
- создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
4. В выполняющем методе:
- создать объект класса Clock
- отправить главную нить в сон на 4 секунды
- поменять значение переменной isStopped на true
- отправить главную нить в сон на 1 секунду
*/

public class Task01 {
    public static boolean isStopped;

    public static void main(String[] args) {
        Clock clock = new Clock("Киев", 23, 59, 58);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isStopped = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Clock extends Thread {
    private String cityName;
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.start();
    }

    private void printTime() throws InterruptedException {

        if (this.hours == 0 & this.minutes == 0 & this.seconds == 0) {
            System.out.printf("В г. %s сейчас полночь!\n", this.cityName);

            Thread.sleep(1000);


        } else {
            System.out.printf("В г. %s сейчас %d:%d:%d!\n", this.cityName, this.hours, this.minutes, this.seconds);

            Thread.sleep(1000);

        }

    }

    @Override
    public void run() {
        while (!Task01.isStopped) {
            try {
                printTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.seconds++;
            if (this.seconds == 60) {
                this.minutes++;
                this.seconds = 0;
            }

            if (this.minutes == 60) {
                this.hours++;
                this.minutes = 0;
            }
            if (this.hours == 24) {
                this.hours = 0;
            }


        }
    }
}
