package com.company.Lesson02;

/**
 * Created by Toll on 08.06.2017.
 */

/*
Создать класс Cat с параметрами: name, age, power
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от силы.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Task06 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3);
        Cat cat2 = new Cat("Lom", 5);
        if(cat1.fight(cat2)) System.out.println(cat1.name+" "+cat1.power+" winner  " + cat2.name+" "+cat2.power);
        else System.out.println(cat2.name+" "+cat2.power+" winner "+cat1.name+" "+cat1.power);

    }
}

class Cat {
    String name;
    int age;
    int power;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        power = (int) (Math.random() * 100 + 1);
    }

    boolean fight(Cat anotherCat) {
        if (this.power >= anotherCat.power) return true;
        else return false;
    }
}