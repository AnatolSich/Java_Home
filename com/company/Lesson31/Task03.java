package com.company.Lesson31;

import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * Created by Toll on 04.11.2017.
 */

/*
1. Создать интерфейс MusicalInstrument с методами: Date startPlaying() и Date stopPlaying()
2. Сделать интерфейс MusicalInstrument таском для нити.
3. В выполняющем классе создать переменную типа int с названием delay и значением 1000
4. В выполняющем классе создать метод sleepNSeconds(int n), который должен погружать в сон нить на n * delay миллисекунд
5. Создать класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
5.1 Создать приватную переменную private String musician;
5.2 Создать конструктор.
6. Реализуй необходимые методы в нити Violin. Реализация должна быть следующей:
6.1. Метод startPlaying() должен возвращать время начала игры.
6.2. Метод stopPlaying() должен возвращать время окончания игры.
7. Создать метод run() и выполнить в нём следующее:
7.1. Считай время начала игры - метод startPlaying().
7.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
7.3. Считай время окончания игры - метод stopPlaying().
7.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
8. В выполняющем классе создать метод main и зпустить таск класса Violin.
*/

public class Task03 {
    static int delay = 1000;

    static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread my = new Thread(new Violin("Paganini"));
        my.start();
    }

}

interface MusicalInstrument extends Runnable {
    Date startPlaying();

    Date stopPlaying();
}

class Violin implements MusicalInstrument {
    private String musician;

    public Violin(String musician) {
        this.musician = musician;
    }


    @Override
    public Date startPlaying() {
        return new Date();
    }

    @Override
    public Date stopPlaying() {
        return new Date();
    }

    @Override
    public void run() {
        Date start = startPlaying();
        Task03.sleepNSeconds(2);
        Date stop = stopPlaying();
        System.out.println("Playing " + this.musician + " " + (stop.getTime() - start.getTime()) + "ms");
    }
}