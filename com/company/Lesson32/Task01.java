package com.company.Lesson32;

import static com.company.Lesson32.Task01.soundsInOneSpeech;
import static com.company.Lesson32.Task01.totalCountSpeeches;

/**
 * Created by Toll on 09.11.2017.
 */

/* Продвижение на политических дебатах
1. В выполняющем классе создать 2 статические переменные:
- int totalCountSpeeches = 200;
- int soundsInOneSpeech = 1000000;
1. Создать класс Politic, унаследовать его от Thread
2. В классе Politic создать приватную переменную int countSounds
3. Создать конструктор с параметром String name и передать этот параметр в конструктор суперкласса
4. Создать метод run и реализовать функционал:
- пока countSounds < totalCountSpeeches * soundsInOneSpeech увеличивать countSounds на один
5. В классе Politic создать метод getCountSpeaches(), который возвращает результат деления countSounds на soundsInOneSpeech
6. В классе Politic переопределить метод toString(), он должен выводить строку "%s сказал речь %d раз",
 где %s - имя нити ( имя политика ), %d - результат метода getCountSpeaches()
7. В выполняющем методе создайте 3 объекта Politic (Иванов, Петров, Сидоров)
7.1 Подождать, пока общее количество сказанных речей всеми политиками не будет равняться переменной totalCountSpeeches
7.1 Вывести на экран toString() каждого объекта
8. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
8.1 Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/

public class Task01 {
    static volatile int totalCountSpeeches = 200;
    static volatile int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politic p1 = new Politic("Иванов",1);
        Politic p2 = new Politic("Петров",1);
        Politic p3 = new Politic("Сидоров",1);
       // p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
        p3.start();

        while (p1.getCountSpeaches() + p2.getCountSpeaches() + p3.getCountSpeaches() < totalCountSpeeches){}

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }


}

class Politic extends Thread {
    private volatile int countSounds;
    private int i;

    public Politic(String name, int i) {
        super(name);
        this.i=i;
    }

    @Override
    public void run() {
        while (countSounds < totalCountSpeeches * soundsInOneSpeech) {
            countSounds+=i;
        }
    }

    public int getCountSpeaches() {
        return countSounds / soundsInOneSpeech;
    }

    @Override
    public String toString() {
        return this.getName() + " сказал речь " + this.getCountSpeaches() + " раз";
    }
}