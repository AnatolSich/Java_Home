package com.company.Lesson24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Toll on 07.09.2017.
 */

/* ООП
1. Создать интерфейс Alive с методом Object containsBones().
2. Создать класс BodyPart, который реализует интерфейс Alive.
2.1 Создать приватную переменную name и сделать конструктор для инициализации.
2.2 Метод containsBones должен возвращать тип Object и значение "Yes"
2.3 Переопределить метод toString(), он должен возвращать name + " содержит кости", если containsBones().equals("Yes") возвращает true,
или он должен возвращать name + " не содержит кости", если containsBones().equals("Yes") возвращает false.
3. Создать класс Finger, который наследуется от класса BodyPart.
3.1 Создать приватную переменную boolean isFoot (это стопа?), переопределить конструктор супер-класса, добавить инициализацию
переменной isFoot
3.2 Переопределить метод containsBones, он должен возвращать тип Object и значение "Yes" вместо true,
если super.containsBones().equals("Yes") && !isFoot, или "No" вместо false
4. Создать метод printlnBodyParts():
- В методе создать список частей тела, добавить в этот список 4 объекта BodyPart (Рука, Нога, Голова, Тело)
- Вывести на экран каждый объект
5. Создать метод printlnFingers():
- В методе создать список пальцев, добавить в этот список 5 объектов Finger
(Большой - рука, Указательный - рука, Средний - стопа, Безымянный - стопа, Мезинец - рука)
- Вывести на экран каждый объект
6. Вызвать методы в main.
*/

public class Test01 {


    public static void main(String[] args) {
        printlnBodyParts();
        printlnFingers();
       /* Finger f = new Finger("Стопа", "Средний");
        System.out.println(f.isFoot);*/

    }

    private static void printlnBodyParts() {

        Set set = new HashSet();

        List<BodyPart> list = new ArrayList<>();
        list.add(new BodyPart("Рука"));
        list.add(new BodyPart("Нога"));
        list.add(new BodyPart("Голова"));
        list.add(new BodyPart("Тело"));
        for (BodyPart b : list
                ) {
            System.out.println(b);
        }
        System.out.println("****************");
    }

    private static void printlnFingers() {
        List<Finger> list = new ArrayList<>();
        list.add(new Finger("Рука", "Большой"));
        list.add(new Finger("Рука", "Указательный"));
        list.add(new Finger("Стопа", "Средний"));
        list.add(new Finger("Стопа", "Безымянный"));
        list.add(new Finger("Рука", "Мезинец"));
        for (Finger f : list
                ) {
            System.out.println(f);
        }
        System.out.println("****************");
    }
}
interface Alive {
    Object containsBones();
}

class BodyPart implements Alive {
    private String name;

    public BodyPart(String name) {
        this.name = name;
    }

    @Override
    public Object containsBones() {
        return "Yes";
    }

    @Override
    public String toString() {
        if (containsBones().equals("Yes"))
            return name + " содержит кости";
        else return name + " не содержит кости";
    }
}

class Finger extends BodyPart {
    private String name;
    boolean isFoot;

    public Finger(String name1, String name2) {
        super(name1);
        this.name = name2;
        if (name1.equals("Стопа"))
            this.isFoot = true;
        else this.isFoot = false;
    }

    @Override
    public Object containsBones() {
        if (super.containsBones().equals("Yes") && !isFoot) return "Yes";
        else return "No";                                                   //Если super.name==Стопа
    }
}