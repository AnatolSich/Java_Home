package com.company.Lesson35;

/**
 * Created by Toll on 18.11.2017.
 */

/* Аэропорт
1. В выполняющем классе создать метод waiting(), который отправляет нить в сон на 100мс
2. В выполняющем классе создать метод takingOff(), который отправляет нить в сон на 100мс
3. Создать класс Runway (взлетная полоса) (может отправлять 1 самолет за 1 секунду )
3.1 В классе Runway:
- создать приватную переменную типа Thread
- для переменной создать геттер и сеттер
4. В выполняющем классе создать статическую переменную RUNWAY, подумать, какой тип у данной переменной
5. Создать класс Plane, унаследовать его от Thread
6. В классе Plane:
- создать конструктор с параметром name, передать переменную name в конструктор суперкласса
- в конструкторе запустить нить
- реализовать метод run():
6.1 создать переменную isAlreadyTakenOff, подумать какой тип у переменной, инициализировать её значением по-умолчанию
6.2 пока переменная isAlreadyTakenOff имеет значение false, выполнять следующее:
- ЕСЛИ взлетная полоса свободна, занимать её
- выводить на экран надпись getName() + " взлетает"
- производить взлет самолета
- выводить на экран надпись getName() + " уже в небе"
- присвоить переменной isAlreadyTakenOff значение true
- освободить взлетную полосу
- ИНАЧЕ, если взлетная полоса занята самолетом
- выводить на экран надпись getName() + " ожидает"
- вызвать метод, который отвечает за ожидание
7. В выполняющем методе создать и запустить 3 нити(самолета)
*/

public class Task02 {
    static int planesTakenOff = 0;

    static void waiting(Plane plane) {
        try {
            plane.wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Runway extends Thread {
    boolean checking = false;
    Plane plane;

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void run() {
        while (true) {
            if (plane.isAlreadyTakenOff) {
                Task02.planesTakenOff++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Plane extends Thread {
    boolean isAlreadyTakenOff;
    Runway runway;

    public Plane(String name, Runway runway) {
        super(name);
        this.start();
        this.runway = runway;
    }

    @Override
    public void run() {
        while (!isAlreadyTakenOff) {
            if (!runway.checking) {
                runway.setPlane(this);
                System.out.println(getName() + " взлетает");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + " уже в небе");
                this.isAlreadyTakenOff = true;

                runway.setPlane(null);


            } else {
                Task02.waiting(this);
                System.out.println(getName() + " ожидает");
            }
        }
    }
}