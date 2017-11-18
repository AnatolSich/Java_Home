package com.company.Lesson34;

/**
 * Created by Toll on 16.11.2017.
 */

/*  (Секундомер)
1. В выполняющем классе создать статическую переменную isStopped, присвоить ей значение false
2. Создать класс Stopwatch, унаследовать его от Thread
3. Создать класс Runner
4. В классе Stopwatch:
- создать приватную переменную Runner owner;
- создать приватную переменную int stepNumber;
- создать конструктор и инициализировать в нём переменную owner;
- создать метод doSeveralSteps, пока что без реализации;
- создать метод run(), он должен:
  -- пока переменная isStopped равняется false выполнять метод doSeveralSteps;
  -- отлавливать все checked исключения.
5. В классе Runner создать параметры name, speed, stopwatch - подумать, какой тип данный у каждого параметра
5.1 Создать конструктор для инициализация всех параметров класса Runner, подумать как корректно инициализировать
5.2 Сделать переменные name, speed приватными, создать для них геттеры
5.3 Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
5.4 Создать метод start(), он должен запускать нить stopwatch
6. Реализовать метод doSeveralSteps:
- увеличивать счетчик шага на один
- записывать скорость бегуна в новую переменную
- отправлять нить в сон на 1000 / speed1 мс
- выводить на экран надпись owner.getName() + " делает шаг №" + stepNumber + "!"
7. В выполняющем методе создать два объекта Runner
8. Вызвать метод start у каждого объекта
9. Отправить гланую нить в сон на 2 секунды
10. Поменять значение переменной isStopped на true
11. Отправить главную нить в сон на одну секунду
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
*/

public class Task02 {
    static boolean isStopped;

    public static void main(String[] args) {


        Runner ivanov = new Runner("Иванов", 2);
        Runner petrov = new Runner("Петров", 8);

        ivanov.start();
        petrov.start();

        try {
            Thread.sleep(2000);
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

class Stopwatch extends Thread {
    private Runner owner;
    private int stepNumber;

    public Stopwatch(String name, Runner owner) {
        super(name);
        this.owner = owner;
    }

    private void doSeveralSteps() {
        this.stepNumber++;
        int speed1 = owner.getSpeed();
        try {
            Thread.sleep(1000 / speed1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" запустился...");
        while (!Task02.isStopped) {
            try {
                doSeveralSteps();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner {
    private String name;
    private int speed;
    private Stopwatch stopwatch;

    public Runner(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.stopwatch = new Stopwatch("Секундомер " + this.name + "а", this);

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        stopwatch.start();
    }
}